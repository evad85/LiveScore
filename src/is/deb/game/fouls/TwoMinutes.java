/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.game.fouls;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class TwoMinutes {
    String suspensionTime;
    int playerNumber;
    
    public TwoMinutes(String time, int number) {
        suspensionTime = time;
        playerNumber = number;
    }
    
    public int getPlayer() {
        return playerNumber;
    }
    
    public String getCardTime() {
        return suspensionTime;
    }
    
    
}
