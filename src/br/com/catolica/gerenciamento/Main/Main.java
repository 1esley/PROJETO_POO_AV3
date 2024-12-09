package br.com.catolica.gerenciamento.Main;

import java.util.Scanner;

import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumDiasDaSemana;
import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumModalidades;
import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Campeonato;
import br.com.catolica.gerenciamento.Modules.Games.Model.Basics.Data;
import br.com.catolica.gerenciamento.Modules.Games.Model.Campeonatos.Mundial;
import br.com.catolica.gerenciamento.Modules.Games.Model.Partidas.CS2;
import br.com.catolica.gerenciamento.Modules.Team.Controller.CoachController;
import br.com.catolica.gerenciamento.Modules.Team.Enum.EnumFuncaoPlayer;
import br.com.catolica.gerenciamento.Modules.Team.Enum.EnumTipoPlayer;
import br.com.catolica.gerenciamento.Modules.Team.Exception.EscolhaInvalidaException;
import br.com.catolica.gerenciamento.Modules.Team.Exception.LineUPCheiaException;
import br.com.catolica.gerenciamento.Modules.Team.Model.Player;
import br.com.catolica.gerenciamento.Modules.Team.Model.SocialMedia;
import br.com.catolica.gerenciamento.Modules.Team.Model.Time;
import br.com.catolica.gerenciamento.Modules.Team.View.CoachView;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            List<Campeonato> campeonatos = new ArrayList<>();
            Time catolicaEsports = new Time("Catolica Esports", new Data(9, 12, 2024));
            CoachView coachView = new CoachView();
            Mundial major = new Mundial("MAJOR", 1_000_000, new Data(10, 10, 2024), EnumModalidades.FPS);
            CS2 partidaCs2 = new CS2(new Data(10, 10, 2024), EnumDiasDaSemana.SABADO, major);

            System.out.println("SISTEMA DE GERENCIAMENTO INTERNO DA CATOLICA E-SPORTS");

            int opt = 0;
            do {
                try {
                    System.out.print("---------- MENU PRINCIPAL ----------\n" +
                            "[1] Coach\n" +
                            "[2] Social media\n" +
                            "[3] Campeonatos\n" +
                            "[4] Sair\n--> ");
                    if (!keyboard.hasNextInt()) {
                        throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
                    }
                    opt = keyboard.nextInt();
                    keyboard.nextLine();

                    switch (opt) {
                        case 1:
                            menuCoach(catolicaEsports, coachView, partidaCs2, keyboard);
                            break;
                        case 2:
                            menuSocialMedia(partidaCs2, major, keyboard);
                            break;
                        case 3:
                            menuCampeonatos(campeonatos, keyboard);;
                            break;
                        case 4:
                            System.out.println("Encerrando...");
                            break;
                        default:
                            System.err.println("Opção inválida! Escolha um número entre 1 e 4.");
                    }
                } catch (InputMismatchException e) {
                    System.err.println(e.getMessage());
                    keyboard.nextLine();
                }
            } while (opt != 4);
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + (e.getMessage()));
        } finally {
            keyboard.close();
        }
    }

    private static void menuCoach(Time catolicaEsports, CoachView coachView, CS2 partidaCs2, Scanner keyboard) {
        try {
            CoachController coachController = new CoachController();
            boolean coachMenu = true;

            while (coachMenu) {
                System.out.print("---------- COACH ----------\n[1] Montar LineUp\n[2] Treinar LineUp\n[3] Trazer jogadores pro time\n[4] Voltar\n--> ");
                if (!keyboard.hasNextInt()) {
                    throw new InputMismatchException("Entrada inválida no menu Coach. Por favor, insira um número.");
                }
                int optCoach = keyboard.nextInt();
                keyboard.nextLine();

                switch (optCoach) {
                    case 1:
                        montarLineUp(catolicaEsports, partidaCs2, coachController, keyboard);
                        break;
                    case 2:
                        treinarLineUp(partidaCs2, keyboard);
                        break;
                    case 3:
                        String nome = coachView.inputNome();
                        String cpf = coachView.inputCpf();
                        EnumTipoPlayer tipo = coachView.inputTipoPlayer();
                        EnumFuncaoPlayer funcao = coachView.inputFuncaoPlayer();
                        coachController.trazerProTime(catolicaEsports, new Player(nome, cpf, tipo, funcao));
                        System.out.println("Player contratado com sucesso!");
                        break;
                    case 4:
                        coachMenu = false;
                        break;
                    default:
                        System.err.println("Opção inválida no menu Coach!");
                }
            }
        } catch (Exception e) {
            System.err.println("Erro no menu Coach: " + (e.getMessage()));
        }
    }

    private static void montarLineUp(Time catolicaEsports, CS2 partidaCs2, CoachController coachController, Scanner keyboard) {
        try {
            System.out.println("Esses são os jogadores contratados:");
            for (Player jogador : catolicaEsports.getJogadores()) {
                System.out.println(jogador.toString());
            }
            System.out.println("Selecione a line que deseja montar.");
            System.out.print("---------- LINEUP'S ----------\n[1] CS2\n[2] Valorant\n[3] LOL\n[4] Voltar\n--> ");
            if (!keyboard.hasNextInt()) {
                throw new InputMismatchException("Entrada inválida na seleção de LineUp. Por favor, insira um número.");
            }
            int optLineupMontar = keyboard.nextInt();
            keyboard.nextLine();

            switch (optLineupMontar) {
                case 1:
                    if (partidaCs2.lineUp.size() == 5) {
                        throw new LineUPCheiaException("LineUp já contém 5 players");
                    }
                    System.out.println("Insira os nomes dos jogadores para a LineUp CS2:");
                    for (int i = 0; i < 5; i++) {
                        String nomeAInserir = keyboard.nextLine();
                        boolean jogadorEncontrado = false;
                        for (Player jogador : catolicaEsports.getJogadores()) {
                            if (jogador.getNome().equalsIgnoreCase(nomeAInserir)) {
                                coachController.montarLineUP(partidaCs2, jogador);
                                jogadorEncontrado = true;
                                break;
                            }
                        }
                        if (!jogadorEncontrado) {
                            System.err.println("Jogador não encontrado: " + nomeAInserir);
                        }
                    }
                    break;
                default:
                    System.err.println("Opção inválida na montagem de LineUp!");
            }
        } catch (Exception e) {
            System.err.println("Erro na montagem da LineUp: " + (e.getMessage()));
        }
    }

    private static void treinarLineUp(CS2 partidaCs2, Scanner keyboard) {
        try {
            // Verifica se o LineUp tem jogadores
            if (partidaCs2.lineUp.isEmpty()) {
                System.out.println("Não há jogadores na LineUp para treinar.");
                return;
            }

            System.out.println("Treinando os jogadores da LineUp:");
            for (Player jogador : partidaCs2.lineUp) {
                if (!jogador.getTreinado()) {
                    jogador.setTreinado(true);
                    System.out.println(jogador.getNome() + " foi treinado!");
                } else {
                    System.out.println(jogador.getNome() + " já está treniado.");
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao treinar a LineUp: " + e.getMessage());
        }
    }

    private static void menuSocialMedia(CS2 partidaCs2, Mundial major, Scanner keyboard) {
        try {
            System.out.print("---------- SOCIAL MEDIA ----------\n[1] Fazer post\n[2] Voltar\n--> ");
            if (!keyboard.hasNextInt()) {
                throw new InputMismatchException("Entrada inválida. Por favor, insira um número.");
            }
            int optSocialM = keyboard.nextInt();
            keyboard.nextLine();

            if (optSocialM == 1) {
                SocialMedia socialMedia = new SocialMedia("Roberto", "12345678900", 5_000);
                socialMedia.fazerPost(partidaCs2, major);
            } else if (optSocialM == 2) {
                return;
            } else {
                throw new EscolhaInvalidaException("Opção inválida no menu Social Media.");
            }
        } catch (Exception e) {
            System.err.println("Erro no menu Social Media: " + (e.getMessage()));
        }
    }

    private static void menuCampeonatos(List<Campeonato> campeonatos, Scanner keyboard) {
    boolean continuar = true;

    while (continuar) {
        System.out.print("---------- CAMPEONATOS ----------\n[1] Ver campeonatos\n[2] Voltar\n--> ");

        if (!keyboard.hasNextInt()) {
            System.err.println("Entrada inválida. Por favor, insira um número.");
            keyboard.nextLine();
            continue;
        }

        int opt = keyboard.nextInt();
        keyboard.nextLine();
        switch (opt) {
            case 1:
                if (campeonatos.isEmpty()) {
                    System.out.println("Nenhum campeonato cadastrado.");
                } else {
                    System.out.println("---------- LISTA DE CAMPEONATOS ----------");
                    for (Campeonato campeonato : campeonatos) {
                        System.out.println(campeonato.toString());
                    }
                }
                break;

            case 2:
                continuar = false;
                break;

            default:
                System.err.println("Opção inválida.");
        }
    }
}
}