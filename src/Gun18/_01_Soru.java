package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random(10 dahil sayilarla) doldurduktan sonra,
        // kullanicinin girecegi bir rakami arttiriniz.
        // bir rakam var ise indexini yazdiriniz.

        int[] dizi=new int[10];  // 10 elemanli bir dizi tanimladim

        for(int i=0; i < dizi.length; i++)
            dizi[i] = (int)(Math.random()*11);  // dizinin elemanlarini random doldurdum

        Scanner oku=new Scanner(System.in);
        System.out.println("Aranacak sayi(0-10) =");
        int arananRakam=oku.nextInt();  // kullanicidan girecegi bir rakami aldik

        for (int i= 0; i < dizi.length; i++) { // aranan rakam dizide var mi
                if(dizi[i]==arananRakam)
                     System.out.println("Sayi var, oda numarasi(indexi)"+i);


        }

        System.out.println("dizi =" + Arrays.toString(dizi));






    }
}
