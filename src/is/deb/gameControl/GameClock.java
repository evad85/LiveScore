/**
 * 
 */
package is.deb.gameControl;

import java.util.concurrent.TimeUnit;


public class GameClock {
    
    // The elapsed game time in seconds
    private int gameTimeSeconds = 0;
    
    /**
     * Creates a new GameClock object
     */
    public GameClock() {
    }
    
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
        if(gameTimeSeconds < 3600) {
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
