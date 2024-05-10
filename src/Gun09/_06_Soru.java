package Gun09;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // girilen bir sayinin tek sayi olup olmadigini yazdiriniz
        // true veya false

        Scanner oku= new Scanner(System.in);

        System.out.print("Sayi=");
        int sayi=oku.nextInt();

        int kalan= sayi%2;

        System.out.println("Tek Mi?" + (kalan==1));  // 1. yöntem

        boolean sonuc= (kalan==1);
        System.out.println("sonuc=" + sonuc); // 2. yöntem




    }
}
