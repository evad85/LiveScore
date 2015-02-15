/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.teams;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class Player {
    private int playerNumber;
    private String playerName;
    private boolean isPlaying = false;
    private int shots = 0;
    private int saves = 0;
    private int goals = 0;
    
    public Player(int number, String name) {
        playerNumber = number;
        playerName = name;
    }
    
    public int getPlayerNumber() {
        return playerNumber;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public boolean isPlaying() {
        return isPlaying;
    } 
    
    public void playerIsPlaying(boolean b) {
        isPlaying = b;
    }
    
    public void goal() {
        goals++;
    }
    
    public void shot() {
        shots++;
    }
    
    public void saves() {
        saves++;
    }
    
    public double getShotStat() {
        double stat = (double)goals/shots;
        return stat*100;
    }
    
}
