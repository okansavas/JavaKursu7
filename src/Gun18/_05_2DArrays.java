package Gun18;

import java.util.Arrays;

public class _05_2DArrays {
    public static void main(String[] args) {
        int[][] tablo2 = {
                {5, 6, 7, 34, 5},   // 1.satir
                {56, 7, 89, 34, 6}  // 2.satir

        };

        System.out.println(Arrays.toString(tablo2[0])); // 0.satirin tüm elemanlari
        System.out.println(Arrays.toString(tablo2[1])); // 1.satirin tüm elemanlari
        System.out.println(tablo2[0].length); // 0.satirin eleman sayisi
        System.out.println(tablo2[1].length); // 1.satirin eleman sayisi
        System.out.println(tablo2.length);  // satir sayisi

        System.out.println();


        for (int satir = 0; satir < tablo2.length; satir++)  // 2 satir

            for (int sutun = 0; sutun < tablo2[satir].length; sutun++) // 5 sütun
                System.out.println(tablo2[satir][sutun] + "\t");

        System.out.println();


    }
}
