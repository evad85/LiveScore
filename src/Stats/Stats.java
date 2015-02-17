
package Stats;
/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn sér um alla tölfræði útreikninga
 */
public class Stats {
    
    /**
     * Skilar skotnýtingu í prósentum
     * @param shots
     * @param goals
     * @return 
     */
    public double getShotEfficiency(int shots, int goals) {
        double stat = (double)goals/shots;
        return stat*100;
    }
}