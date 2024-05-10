package Gun07;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadi örnegin "Ismet Temur" -> I.T. seklinde yazdiriniz.

        // Ismet Temur  ->  ilkHarf = charAt(0)
        Scanner oku=new Scanner(System.in);
        System.out.print("Adiniz ve Soyadiniz=");
        String adSoyad=oku.nextLine();

        char ilkHarf = adSoyad.charAt(0);  // ilk harfi verir her zaman
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1);  // harfi aldim

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");


    }
}
