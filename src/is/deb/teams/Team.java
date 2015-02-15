/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.teams;

import is.deb.dummyData.Leikmenn;
import is.deb.game.Goal;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public final class Team {
    private int score = 0;
    private Goal[] goals = new Goal[20];
    private Player[] players;
    
    
    public Team(Leikmenn[] team) {
        // hér myndum við sækja gögn frá vefþjónustu
        // eftir einhverjum leitarskilyrðum sem væru komin fram
        setPlayers(team);
    }
    
    public void setPlayers(Leikmenn[] team) {
        players = new Player[team.length];
        for(int i = 0; i<players.length; i++) {
            players[i] = new Player(team[i].getLeikmadurNumer(),team[i].getLeikmadurNafn());
        }
    }
   
    
    
    /**
     * 
     * @param numPlayer
     */
    public void goalScored(int numPlayer) {
        goals[score] = new Goal("",numPlayer);
        score++;
    }
    
    /**
     * 
     * @return 
     */
    public int getScore() {
        return score;
    }
    
    /**
     * 
     * @param number
     * @return 
     */
    public int getPlayerNum(int number) {
        return players[number].getPlayerNumber();
    }
    
    /**
     * 
     * @return 
     */
    public int getGoalScorer() {
        return goals[score-1].getPlayer();
        
    }
    
}
