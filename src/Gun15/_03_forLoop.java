package Gun15;

import java.util.Scanner;

public class _03_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayiya (dahil) kadar sayilarin carpimini bulunuz
        // bölüm 2: carpimin sonucu 10000 i gectiginde islem sonlansin.

        Scanner oku = new Scanner(System.in);
        int sinir = oku.nextInt();
        int carpim = 1;

        for (int i = 1; i < sinir; i++) {

            carpim = carpim * 1;   // 1*2*3*4*5

            if (carpim > 10000)
                System.out.println("break calisti");
            break;

        }


        System.out.println("carpim = " + carpim);
    }
}