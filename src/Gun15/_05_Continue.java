package Gun15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {
        // Kullanicidan 5 tane sayi isteyiniz
        // bu sayilardan 6 ile 10 arasindakiler haric digerlerini toplasin

        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println(i+ ".Sayi Giriniz=");
            int sayi=oku.nextInt();

            if (sayi >6 && sayi <10)
                continue; // döngünün bundan sonrasini pas gec
            // bir sonraki adima devam et

            toplam=toplam+sayi;


        }
        System.out.println("toplam = " + toplam);

    }
}
