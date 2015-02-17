
package is.deb.game;

/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur utan um upplýsingar um einstök mörk sem eru
 * skoruð og inniheldur aðferðir til þess að sækja þessar upplýsingar
 */
public class Goal {
    String goalTime;
    int playerNumber;
    
    /**
     * Býr til nýtt mark
     * @param time
     * @param number 
     */
    public Goal(String time, int number) {
        goalTime = time;
        playerNumber = number;
    }
    
    /**
     * Skilar númer þess leikmanns sem 
     * skoraði markið
     * @return 
     */
    public int getGoalScorer() {
        return playerNumber;
    }
    
    /**
     * Skilar streng sem inniheldur marktímann á forminu
     * "mm:ss"
     * @return 
     */
    public String getGoalTime() {
        return goalTime;
    }
}
