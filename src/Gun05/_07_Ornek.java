package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanicidan bir kenari alinan kare seklinde tarlanin cevresini bulup yazdiriniz.

        Scanner oku= new Scanner(System.in);

        System.out.println("Tarlanin 1 kenar uzunlugu=");
        int kenar=oku.nextInt();

        System.out.println("Cevre = " + (4*kenar));

    }
}
