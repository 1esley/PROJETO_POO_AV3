package br.com.catolica.gerenciamento.Modules.Team.View;

import java.util.Scanner;

import br.com.catolica.gerenciamento.Modules.Team.Enum.EnumFuncaoPlayer;
import br.com.catolica.gerenciamento.Modules.Team.Enum.EnumTipoPlayer;

public class CoachView {

    public String inputNome() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = keyboard.next();
        
        return nome;
    }
    public String inputCpf() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite seu cpf: ");
        String cpf = keyboard.next();
        return cpf;
    }

    public EnumTipoPlayer inputTipoPlayer() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Modalidade do player:\n[1] CS2\n[2] Valorant\n[3] LOL\n--> ");
        int modalidade = keyboard.nextInt();
        switch (modalidade) {
            case 1: return EnumTipoPlayer.CS_PLAYER;
            case 2: return EnumTipoPlayer.VALORANT_PLAYER;
            case 3: return EnumTipoPlayer.LOL_PLAYER;
            default: return null;
        }
        
    }
    
    public EnumFuncaoPlayer inputFuncaoPlayer() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Função do player no jogo:\n[0] AWPER SUPORTE\n[1] SOLO BOMB\n[2] RILFER LURKER\n[3] RIFLER ENTRY\n[4] CONTROLLER\n[5] DAMAGE\n[6] HEALER\n[7]SUPORTE\n[8]TANQUE\n[9]UTILITARIO\n--> ");
        int modalidade = keyboard.nextInt();
        keyboard.close();
        
        switch (modalidade) {
            case 0: return EnumFuncaoPlayer.AWPER_SUPPORT;
            case 1: return EnumFuncaoPlayer.SOLO_BOMB;
            case 2: return EnumFuncaoPlayer.RIFLER_LURKER;
            case 3: return EnumFuncaoPlayer.RIFLER_ENTRY;
            case 4: return EnumFuncaoPlayer.CONTROLLER;
            case 5: return EnumFuncaoPlayer.DAMAGE;
            case 6: return EnumFuncaoPlayer.HEALER;
            case 7: return EnumFuncaoPlayer.SUPPORT;
            case 8: return EnumFuncaoPlayer.TANK;
            case 9: return EnumFuncaoPlayer.UTILITY;
            default: return null;
        }

    }

}