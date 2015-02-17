
package is.deb.dummyData;

/**
 * @author: Dagný Ósk Ragnarsdóttir, Birkir Pálmason og
 * Eva Dögg Steingrímsdóttir
 * @since: 17.02.2015
 * Klasinn heldur utan um "dummy" gögn um handboltalið
 * sem notuð eru til að prófa aðrar aðferðir
 */
public class FH {
    Leikmenn[] leikmenn = new Leikmenn[]{new Leikmenn(7,"Alana Elín Steinarsdóttir"),
        new Leikmenn(22,"Aníta Mjöll Ægisdóttir"), new Leikmenn(7,"Arnheiður Guðmundsdóttir"),
        new Leikmenn(5,"Ásrún Lilja Birgisdóttir"), new Leikmenn(4,"Berglind Ósk Björgvinsdóttir"),
        new Leikmenn(11,"Birna Íris Helgadóttir"), new Leikmenn(13,"Birta Þöll Sveinbjörnsdóttir"),
        new Leikmenn(9,"Elín Ósk Jóhannsdóttir"), new Leikmenn(10,"Heiðdís Rún Guðmundsdóttir"),
        new Leikmenn(16,"Helga Sigríður Magnúsdóttir"), new Leikmenn(12,"Hildur Erlingsdóttir"),
        new Leikmenn(21,"Hind Hannesdóttir"),new Leikmenn(8,"Ingibjörg Pálmadóttir"), 
        new Leikmenn(6,"Rakel Sigurðardóttir"), new Leikmenn(1,"Rebekka Guðmundsdóttir"),
        new Leikmenn(23,"Sara Kristjánsdóttir"), new Leikmenn(3,"Sigrún Jóhannsdóttir"),
        new Leikmenn(25,"Steinunn Snorradóttir")};
    
    /**
     * Skilar fylki sem inniheldur leikmenn liðsins
     * @return 
     */
    public Leikmenn[] getLeikmenn() {
        return leikmenn;
    } 
}
