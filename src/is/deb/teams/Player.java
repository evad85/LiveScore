/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.teams;

import Stats.Stats;

/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur utan upplýsingar um leikmenn, eins og nafn, númer og fjölda marka, 
 * skota og brottvísana og inniheldur aðferðir til þess að nálgast þessar 
 * upplýsingar og breyta þeim
 */
public class Player {
    private final int playerNumber;
    private final String playerName;
    private boolean isPlaying = false;
    private int shots = 0;
    private int saves = 0;
    private int goals = 0;
    private int twoMinutes = 0;
    private final Stats stats = new Stats();
    
    /**
     * Býr til nýjan leikmann
     * @param number
     * @param name 
     */
    public Player(int number, String name) {
        playerNumber = number;
        playerName = name;
    }
    
    /**
     * Skilar númeri leikmanns
     * @return 
     */
    public int getPlayerNumber() {
        return playerNumber;
    }
    
    /**
     * Skilar nafni leikmanns
     * @return 
     */
    public String getPlayerName() {
        return playerName;
    }
    
    /**
     * Hefur gildið true ef leikmaðurinn tekur þátt í leiknum
     * en false ef hann var ekki valinn í liðið
     * @return 
     */
    public boolean isPlaying() {
        return isPlaying;
    } 
    
    /**
     * Gefur breytu sem heldur utan um hvort að leikmaðurinn taki
     * þátt í leiknum gildið b
     * @param value 
     */
    public void playerIsPlaying(boolean value) {
        isPlaying = value;
    }
    
    /**
     * Bætir einu marki við fjölda marka
     */
    public void goal() {
        goals++;
    }
    
    /**
     * Bætir einu skoti við fjölda skota
     */
    public void shot() {
        shots++;
    }
    
    /**
     * Bætir einni vörslu við fjölda varsla
     */
    public void saves() {
        saves++;
    }
    
    /**
     * Skilar skotnýtingu leikmannsin í prósentum
     * @return 
     */
    public double getShotEfficiency() {
        return stats.getShotEfficiency(shots, goals);
    }
    
    /**
     * Bætir einni tveggna mæinútna brottvísun við
     * fjölda brottvísana
     */
    public void twoMinutes() {
        twoMinutes++;
    }
    
    /**
     * Skilar fjölda tveggna mínútna brottvísana
     * @return 
     */
    public int getNumberOfTwoMinutes() {
        return twoMinutes;
    }   
}
