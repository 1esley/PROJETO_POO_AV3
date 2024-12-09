package br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts;

import java.util.ArrayList;

import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumDiasDaSemana;
import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumModalidades;
import br.com.catolica.gerenciamento.Modules.Games.Model.Basics.Data;
import br.com.catolica.gerenciamento.Modules.Team.Model.Player;

public abstract class Game {

    public Data dataDoGame;
    public EnumDiasDaSemana diaDoGame;
    public EnumModalidades modalidade;
    public Object campeonato;

    public ArrayList<Player> lineUp = new ArrayList<>();

    public Game(Data dataDogame, EnumDiasDaSemana diaDoGame, Object campeonato) {
        this.dataDoGame = dataDogame;
        this.diaDoGame = diaDoGame;
        this.campeonato = campeonato;
    }


}