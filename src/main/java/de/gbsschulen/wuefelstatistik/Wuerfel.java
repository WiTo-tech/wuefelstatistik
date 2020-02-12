package de.gbsschulen.wuefelstatistik;


import java.util.Random;

public class Wuerfel implements IWuerfel{


    Random random;

    public Wuerfel() {
        random = new Random();
    }

    @Override
    public int getWurf() {
        int wurf = random.nextInt(6)+1;
        return wurf;
    }

    /*@Override
    public int[] getWuerfe(int zahl) {
        int[] array = new int[zahl];

        for(int i = 0; i < zahl; i++)
        {
            array[i] = getWurf();
            System.out.println(array[i]);
        }
        return array;
    }
    */
    @Override
    public int[] getWuerfe(int zahl) {
        int[] array = new int[7];

        for(int i = 0; i < zahl; i++)
        {
            array[getWurf()-1]++;
        }
        return array;
    }
}
