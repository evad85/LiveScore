
package is.deb.game.fouls;


/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur utan um upplýsingar um tveggja mínútna
 * brottvísanir og inniheldur aðferðir til þess að sækja þessar upplýsingar
 */
public class TwoMinutes {
    String suspensionTime;
    int playerNumber;
    
    /**
     * Býr til nýja brottvísun
     * @param time
     * @param number 
     */
    public TwoMinutes(String time, int number) {
        suspensionTime = time;
        playerNumber = number;
    }
    
    /**
     * Skilar númeri þess leikmanns sem fékk
     * tiltekna brottvísun
     * @return 
     */
    public int getSuspendedPlayer() {
        return playerNumber;
    }
    
    /**
     * Skilar streng sem inniheldur tímann sem brottvísunin
     * átti sér stað á forminu "mm:ss"
     * @return 
     */
    public String getSuspensionTime() {
        return suspensionTime;
    }  
}
