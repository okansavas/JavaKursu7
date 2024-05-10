package Gun14;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
        // Girilen 5 tam sayinin toplaminin sonucunu yazdiriniz

        // Döngünün icinde ne var
        // sayi oku, toplam=toplam+sayi
        // döngü sarti sayac < 5
        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int sayac = 1; sayac <= 5; sayac++) {
            System.out.println(sayac + ".sayi giriniz=");
            int sayi = oku.nextInt();
            toplam = toplam + sayi;
        }

        System.out.println("toplam=" + toplam);
    }
}