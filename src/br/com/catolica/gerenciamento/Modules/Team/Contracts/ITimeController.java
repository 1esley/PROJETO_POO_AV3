package br.com.catolica.gerenciamento.Modules.Team.Contracts;

import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Game;

public interface ITimeController {
    void mostrarJogadores();
    void mostrarTreinadores();
    boolean iniciarPartida(Game game);
    boolean encerrarPartida(Game game);
}
