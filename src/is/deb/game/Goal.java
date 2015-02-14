/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.game;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class Goal {
    String goalTime;
    int playerNumber;
    
    public Goal(String time, int number) {
        goalTime = time;
        playerNumber = number;
    }
    
    public int getPlayer() {
        return playerNumber;
    }
    
}
