package br.com.catolica.gerenciamento.Modules.Team.Contracts;

import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Game;
import br.com.catolica.gerenciamento.Modules.Team.Model.Player;
import br.com.catolica.gerenciamento.Modules.Team.Model.Time;

public interface ICoachController {
    void montarLineUP(Game game, Player player);

    boolean treinarLineUP(Game game);

    void trazerProTime(Time time, Player player);
}
