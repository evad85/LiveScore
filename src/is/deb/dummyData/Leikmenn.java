
package is.deb.dummyData;

/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur utan um "dummy" gögn um handboltalið
 * sem notuð eru til að prófa aðrar aðferðir
 */
public class Leikmenn {
    private final int leikmadurNumer;
    private final String leikmadurNafn;
    
    /**
     * Gefur breytum sem halda utan um númer og nafn
     * leikmanns gildi
     * @param numer
     * @param nafn 
     */
    public Leikmenn(int numer, String nafn) {
        leikmadurNumer = numer;
        leikmadurNafn = nafn;
    }
    
    /**
     * Skilar númeri leikmanns
     * @return 
     */
    public int getPlayerNumber() {
        return leikmadurNumer;
    }
    
    /**
     * Skilar nafni leikmanns
     * @return 
     */
    public String getLeikmadurName() {
        return leikmadurNafn;
    } 
}
