package br.com.catolica.gerenciamento.Modules.Team.Model;

import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Campeonato;
import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Game;
import br.com.catolica.gerenciamento.Modules.Team.Contracts.ISocialMediaController;
import br.com.catolica.gerenciamento.Modules.Team.Model.Abstracts.Pessoa;

public class SocialMedia extends Pessoa implements ISocialMediaController{
    private double salario;
    public SocialMedia(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }

    @Override
    public void fazerPost(Game jogo, Campeonato camp) {
        System.out.printf("---------- ATENÇÃO TORCIDA! ------------\nA Catolica Esports volta a jogar dia %s, %s!!!\nA partida é válida pelo %s e %.2f estão em jogo!", jogo.dataDoGame.toString(), jogo.diaDoGame, camp.nome, camp.premiacao);
        System.out.println("A nossa LineUp será:");
        for (Player player : jogo.lineUp) {
            System.out.println(player.toString());
        }
        System.out.println("Esperamos você!");
    }
}