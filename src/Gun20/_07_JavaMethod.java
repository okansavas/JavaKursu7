package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        // Kullanici ile 5 elemanli bir diziyi doldurduktan sonra
        // dizinin en kucuk, en buyuk elemanini ve
        // ortalamasini ayri fonksiyonlarda bulup yazdiriniz

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];

        for(int i=0; i < dizi.length; i++) {
            System.out.println("Sayi Giriniz");
            dizi[i]=oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

        enBuyukYaz(dizi);
        enKucukYaz(dizi);
        ortalamaYaz(dizi);
    }
    public static void enBuyukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En büyük=" + dizi[dizi.length-1]);
    }

    public static void enKucukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En kucuk=" + dizi[0]);
    }
    public static void ortalamaYaz(int[] dizi) {
        int toplam=0;
        for(int i=0; i< dizi.length; i++)
            toplam=toplam+dizi[i];

        int ort=toplam/ dizi.length;

        System.out.println("ort =" + ort);



    }


}
