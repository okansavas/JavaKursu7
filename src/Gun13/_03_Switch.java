package Gun13;

import java.util.Scanner;

public class _03_Switch {
    public static void main(String[] args) {
        // Girilen bir sayinin birler basamaginin degerini yazi ile yazdiriniz.
        // mesela
        // 234   -> birler basamagi -> 4  -> dört
        // 45  -> bes
        // 6 -> alti

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi Giriniz=");
        int sayi=oku.nextInt();

        int birlerBasamagi = (sayi%10);

        switch (birlerBasamagi) {
            case 0: System.out.println("Sifir"); break;
            case 1: System.out.println("Bir"); break;
            case 2: System.out.println("Iki"); break;
            case 3: System.out.println("Üc"); break;
            case 4: System.out.println("Dört"); break;
            case 5: System.out.println("Bes"); break;
            case 6: System.out.println("Alti"); break;
            case 7: System.out.println("Yedi"); break;
            case 8: System.out.println("Sekiz"); break;
            case 9: System.out.println("Dokuz"); break;
        }





    }
}
