/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.game.fouls;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class YellowCard {
    String cardTime;
    int playerNumber;
    
    public YellowCard(String time, int number) {
        cardTime = time;
        playerNumber = number;
    }
    
    public int getPlayer() {
        return playerNumber;
    }
    
    public String getCardTime() {
        return cardTime;
    }
    
}
