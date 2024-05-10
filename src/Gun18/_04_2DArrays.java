package Gun18;

import java.util.Arrays;

public class _04_2DArrays {
    public static void main(String[] args) {
        int[] dizi = new int[10]; // 10 tane, elemanlari bos dizi, default 0
        int[] dizi2 = {2, 3, 4, 5, 66, 7, 8, 99, 23, 3}; // 10 tane elemanlari dolu bir dizi

        int[][] tablo = new int[2][5]; // 2 satirli, 5 sütunlu, 10 elemanli

        int[][] tablo2 = {
                {5, 6, 7, 34, 5},   // 1.satir
                {56, 7, 89, 34, 6}  // 2.satir


        };

        // 1. Yöntem

        for (int i = 0; i < 5; i++) ; // bu for ilk satirin tüm elemanlarini yazdirir
            System.out.println(tablo2[0][i]);

        for (int i = 0; i < 5; i++) {  // bu for 2. satirin tüm elemanlarini yazdirir
            System.out.println(tablo2[1][i]);

            System.out.println("***********");
            // 2.Yöntem

            for (int satir = 0; satir < 2; satir++) { // 2 satir

                for (int sutun = 0; sutun < 5; sutun++) // 5 sütun
                    System.out.print(tablo2[satir][sutun] + "\t");

                System.out.println();


            }


        }

    }
}

