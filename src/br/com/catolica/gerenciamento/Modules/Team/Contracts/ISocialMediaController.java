package br.com.catolica.gerenciamento.Modules.Team.Contracts;

import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Campeonato;
import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Game;

public interface ISocialMediaController {
    void fazerPost(Game jogo, Campeonato comp);
}
