package br.com.catolica.gerenciamento.Modules.Games.Model.Partidas;

import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumDiasDaSemana;
import br.com.catolica.gerenciamento.Modules.Games.Enum.EnumModalidades;
import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Campeonato;
import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Game;
import br.com.catolica.gerenciamento.Modules.Games.Model.Basics.Data;

public class CS2 extends Game {
    private int tempoNecessario;

    public CS2(Data dataDoGame, EnumDiasDaSemana diaDoGame, Campeonato campeonato) {
        super(dataDoGame, diaDoGame, campeonato);
        this.modalidade = EnumModalidades.FPS;
        this.tempoNecessario = this.modalidade.getHorasDeDuracaoMD3();
    }

    public int getTempoNecessario() {
        return this.tempoNecessario;
    }
}