package de.gbsschulen.wuefelstatistik;

public class Statistik implements IStatistik{

    Wuerfel wuerfel = new Wuerfel();

    @Override
    public String getTabelle(int zahl) {
        int[] array;
        String inhalt ="";
        array = wuerfel.getWuerfe(zahl);
        String tabellenkopf = ("Augen | Anzahl \n" );
        for(int i = 0; i < 6; i ++)
        {
            inhalt = inhalt + (i +1 + " | " + array[i] + "\n");
        }

        return tabellenkopf + inhalt;
    }

    @Override
    public String getBalkendiagramm(int zahl) {

        return null;
    }
}
