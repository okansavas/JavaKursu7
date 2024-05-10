package Gun18;

import java.util.Scanner;

public class _03_2DArrays {
    public static void main(String[] args) {
        int sayi=0;  // 1 tane sayi tutar

        int[] dizi=new int[10];  // 10 tane sayi tutar

        int[] ders1Notlar=new int[50]; // ayri ayri 50
        int[] ders2Notlar=new int[50]; // ayri ayri 50
        int[] ders3Notlar= new int[50]; // ayri ayri 50

        // 3 tane 50 yi tek kalemde tek degiskende nasil tanimlarim
        int[][] tumDersNotlar=new int[3][50]; // yukaridaki ile ayni
        //       [satir] [sütun]
        tumDersNotlar[0][0] = 80;  // 2 indexle elemana ulasilir, bu ilk elemani

        System.out.println("tumDersNotlar = " + tumDersNotlar[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersNotlar[0][0]=oku.nextInt();


    }
}
