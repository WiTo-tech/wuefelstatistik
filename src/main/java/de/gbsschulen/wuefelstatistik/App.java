package de.gbsschulen.wuefelstatistik;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Wuerfel wuerfel = new Wuerfel();
        Statistik statistik = new Statistik();
        System.out.println(statistik.getTabelle(100));
        //wuerfel.getWuerfe(100);
    }
}
