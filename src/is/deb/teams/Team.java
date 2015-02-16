/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.teams;

import is.deb.dummyData.Leikmenn;
import is.deb.game.Goal;
import is.deb.game.fouls.TwoMinutes;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public final class Team {
    private int score = 0;
    private int suspensions = 0;
    private Goal[] goals = new Goal[20];
    private Player[] players;
    private final String teamName;
    private TwoMinutes[] twoMinutes = new TwoMinutes[10];
    
    
    public Team(Leikmenn[] team, String name) {
        // hér myndum við sækja gögn frá vefþjónustu
        // eftir einhverjum leitarskilyrðum sem væru komin fram
        setPlayers(team);
        teamName = name;
    }
    
    public void setPlayers(Leikmenn[] team) {
        players = new Player[team.length];
        for(int i = 0; i<players.length; i++) {
            players[i] = new Player(team[i].getLeikmadurNumer(),team[i].getLeikmadurNafn());
        }
    }
    
    public String getTeamName() {
        return teamName;
    }
    
    
    
    public Player[] getPlayers() {
        return players;
    }
    
    public Player getPlayerAtArrayPosition(int pos) {
        return players[pos];
    }
   
    
    
    /**
     * 
     * @param numPlayer
     */
    public void goalScored(String time,int numPlayer) {
        goals[score] = new Goal(time,numPlayer);
        score++;
    }
    
    public void twoMinutes(String time,int numPlayer) {
        twoMinutes[suspensions] = new TwoMinutes(time,numPlayer);
        suspensions++;
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
    public Player getPlayerNumber(int number) {
        return players[number];
    }
    
    /**
     * 
     * @return 
     */
    public int getGoalScorer() {
        return goals[score-1].getPlayer();
        
    }
    
    public String getGoalTime() {
        return goals[score-1].getGoalTime();
    }
    
}
