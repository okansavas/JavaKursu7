package Gun14;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // kullanicinin girecegi 6 sayidan tek olanlarinin toplamini bulunuz

        // döngünün icinde ne olacak
        // sayi okuma, tekse toplam=toplam+sayi , sayac++

        Scanner oku= new Scanner(System.in);
        int sayac=0, toplam=0;

        while (sayac<6) {
            System.out.println("Sayi Giriniz=");
            int sayi= oku.nextInt();

            if (sayi % 2==1)
                toplam=toplam+sayi;

            sayac++;
        }
        System.out.println("toplam = " + toplam);



    }
}
