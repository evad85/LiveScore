/**
 * 
 */
package is.deb.gameControl;

import java.util.concurrent.TimeUnit;

/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur upplýsingar um leiktímann og inniheldur aðferðir til þess
 * að nálgast þessar upplýsingar
 */
public class GameClock {
    
    // The elapsed game time in seconds
    private int gameTimeSeconds = 0;
    private final int maximumGameTime = 3600;
    
    /**
     * The elapsed game time in a mm:ss format.
     * @return 
     */
    public String getGameTimeString() {
        return String.format("%02d:%02d", 
        TimeUnit.SECONDS.toMinutes(gameTimeSeconds),
        TimeUnit.SECONDS.toSeconds(gameTimeSeconds) - 
        TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(gameTimeSeconds)));
        
    }
    
    /**
     * Increases the elapsed game time by one second
     */
    public void increaseSeconds() {
        if(gameTimeSeconds < maximumGameTime) {
            gameTimeSeconds++;
        }
    }
    
    /**
     * Decreases the elapsed game time by one second
     */
    public void decreaseSeconds() {
        if(gameTimeSeconds > 0) {
            gameTimeSeconds--;
        }
    }
    
    /**
     * returns the elapsed game time in seconds
     * @return 
     */
    public int getGameTime() {
        return gameTimeSeconds;
    }    
}
