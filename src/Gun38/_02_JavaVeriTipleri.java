package Gun38;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel tipler, primitive tipler, short, byte, long, double
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2;  // sayi 1=10, sayi2=10

        sayi1=45;
        sayi2=60;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // referans tipler
        int[] dizi1={1,2,3,4};
        int[] dizi2={5,6};

        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1=dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1)); //5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2)); //5,6








    }
}
