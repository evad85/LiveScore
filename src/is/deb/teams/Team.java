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
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur utan upplýsingar um lið, eins og leikmenn, fjölda brottvísana
 * og mörk og inniheldur aðferðir til þess að nálgast þessar 
 * upplýsingar og breyta þeim
 */
public final class Team {
    private int score = 0;
    private int numberOfSuspensions = 0;
    private final Goal[] goals = new Goal[20];
    private Player[] players;
    private final String teamName;
    private final TwoMinutes[] suspensions = new TwoMinutes[10]; 
    
    
    /**
     * Býr til nýtt lið
     * @param team
     * @param name 
     */
    public Team(Leikmenn[] team, String name) {
        // hér myndum við sækja gögn frá vefþjónustu
        // eftir einhverjum leitarskilyrðum sem væru komin fram
        setPlayers(team);
        teamName = name;
    }
    
    /**
     * Sækir alla leikmenn liðsins sem taka þátt í leiknum og setur þá í fylki
     * leikmanna
     * @param team 
     */
    public void setPlayers(Leikmenn[] team) {
        players = new Player[team.length];
        for(int i = 0; i<players.length; i++) {
            String name = team[i].getLeikmadurName();
            int number = team[i].getPlayerNumber();
            players[i] = new Player(number,name);
        }
    }
    
    /**
     * Skilar nafni liðsins
     * @return 
     */
    public String getTeamName() {
        return teamName;
    }
    
    /**
     * Skilar fylki sem inniheldur alla leikmenn liðsins
     * @return 
     */
    public Player[] getPlayers() {
        return players;
    }
    
    /**
     * Skilar þeim leikmanni sem er í sæti pos í fylki allra
     * leikmanna
     * @param pos
     * @return 
     */
    public Player getPlayerAtArrayPosition(int pos) {
        return players[pos];
    }
    
    /**
     * Býr til nýtt mark og setur það í fylki allra marka
     * @param time
     * @param numPlayer 
     */
    public void newGoal(String time, int numPlayer) {
        goals[score] = new Goal(time,numPlayer);
        score++;
    }
    
    /**
     * Býr til nýja brottvísun og setur hana í fylki allra brottvísanna
     * @param time
     * @param numPlayer 
     */
    public void twoMinutes(String time,int numPlayer) {
        suspensions[numberOfSuspensions] = new TwoMinutes(time,numPlayer);
        numberOfSuspensions++;
    }
    
    /**
     * Skilar fjölda marka sem líðið hefur skorað
     * @return 
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Skilar leikmanninum í sæti number í fylki allra
     * leikmanna
     * @param number
     * @return 
     */
    public Player getPlayer(int number) {
        return players[number];
    }
}
