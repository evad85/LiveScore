/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.teams;

import is.deb.game.Goal;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class Team {
    int score = 0;
    Goal[] goals = new Goal[20];
    Player[] players = new Player[2];
    
    
    public Team() {
        players[0] = new Player(2);
        players[1] = new Player(4);
    }
   
    
    
    /**
     * 
     */
    public void goalScored(int numPlayer) {
        goals[score] = new Goal("",numPlayer);
        score++;
    }
    
    public int getScore() {
        return score;
    }
    
    public int getPlayerNum(int number) {
        return players[number].getPlayerNumber();
    }
    
    public int getGoalScorer() {
        return goals[score-1].getPlayer();
        
    }
    
}
