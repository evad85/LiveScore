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
    
    public Player(int number, String name) {
        playerNumber = number;
        playerName = name;
    }
    
    public int getPlayerNumber() {
        return playerNumber;
    }
    
}
