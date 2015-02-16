/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stats;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class Stats {
    
    public double calculateShotStats(int shots, int goals) {
        double stat = (double)goals/shots;
        return stat*100;
    }
}
