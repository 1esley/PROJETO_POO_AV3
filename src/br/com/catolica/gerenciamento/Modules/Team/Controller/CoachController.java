package br.com.catolica.gerenciamento.Modules.Team.Controller;

import br.com.catolica.gerenciamento.Modules.Games.Model.Abstracts.Game;
import br.com.catolica.gerenciamento.Modules.Team.Contracts.ICoachController;
import br.com.catolica.gerenciamento.Modules.Team.Model.Player;
import br.com.catolica.gerenciamento.Modules.Team.Model.Time;

public class CoachController implements ICoachController{


    @Override
    public void montarLineUP(Game game, Player player) {
        
        switch (game.modalidade) {
            case FPS:
                game.lineUp.add(player);
                break;
            case FUTEBOL:
                game.lineUp.add(player);
                break;
            case RPG:
                game.lineUp.add(player);
                break;
            default:
                break;                
        }

    }

    @Override
    public boolean treinarLineUP(Game game) {
        int playersTreinados = 0;
        for (Player player : game.lineUp) {
            int i = game.lineUp.indexOf(player);
            Player playerTreinando = game.lineUp.get(i);
            playerTreinando.setTreinado(true);
            playersTreinados++;
            if (playersTreinados == game.lineUp.size()) {
                return true; 
            }
        }
        return false;
    }

    @Override
    public void trazerProTime(Time time, Player player) {
        time.getJogadores().add(player);
    }
}