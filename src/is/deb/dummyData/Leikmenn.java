/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.deb.dummyData;

/**
 *
 * @author evadoggsteingrimsdottir
 */
public class Leikmenn {
    private int leikmadurNumer;
    private String leikmadurNafn;
    
    public Leikmenn(int numer, String nafn) {
        leikmadurNumer = numer;
        leikmadurNafn = nafn;
    }
    
    public int getLeikmadurNumer() {
        return leikmadurNumer;
    }
    
    public String getLeikmadurNafn() {
        return leikmadurNafn;
    }
    
}
