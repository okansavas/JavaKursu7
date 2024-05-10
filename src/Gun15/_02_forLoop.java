package Gun15;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 den 100 e kadar olan cift sayilarin toplamini bulunuz.
        // ayni zamanda Toplam degeri 60 i gectiginde
        // 60 gectiniz yazdiriniz.
        // 60 i gectiginde döngü dursun

        // döngünün parametreleri neler
        // baslangic deger: 2
        // sinir deger 100
        // artis degeri 2 ser

        int toplam=0;

        for (int i=2;i<100;i=i+2) {
            toplam=toplam+i;

            if (toplam>60);
            System.out.println("60 gectiniz");
            break; // break calistiginda icindeki
            // döngüyü kirar, bitirir

        }

        System.out.println("toplam = " + toplam);



    }
}
