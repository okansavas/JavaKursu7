package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class _06_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random (10(dahil)) a kadar olan sayilarla
        // doldurduktan, tekrarli degerleri almayacak sekilde yeni bir
        // diziye atiniz.

        Integer[] dizi=new  Integer[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*11);

            System.out.println("dizi = " + Arrays.toString(dizi));

            TreeSet<Integer> ts=new TreeSet<>();

            // 1.Yöntem
            for (int j = 0; j < dizi.length; i++)
               ts.add(dizi[i]);

            System.out.println("ts = " + ts);

            // 2.Yöntem
            TreeSet<Integer> ts2= new TreeSet<>(Arrays.asList(dizi) );
            System.out.println("ts2 = " + ts2);

            // 3.Yöntem
            TreeSet<Integer> ts3=new TreeSet<>();
            ts3.addAll(Arrays.asList());
            System.out.println("ts3 = " + ts3);

            // 4.Yöntem
            TreeSet<Integer> ts4= new TreeSet<>();
            Collections.addAll(ts4, dizi);
            System.out.println("ts4 = " + ts4);



            
        }




    }
}
