package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Günün sorusu: 3x2 lik bir diziyi kullanicidan sayi alarak
        // doldurduktan sonra sadece tek elemanlarini tek boyutlu
        // diziye atayiniz

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[3][2]; // 3 satir 2 sütun

        int tekMiktar=0;
        for(int i=0; i < tablo.length; i++) {

            for( int j= 0; j < tablo.length; j++) {
                System.out.println("Sayi Giriniz");
                tablo[i][j]=oku.nextInt();

                if(tablo[i][j] % 2 ==1)
                    tekMiktar++;
            }

        }

        // tabloyu yazdiralim bakalim
        System.out.println("0.Satir=" + Arrays.toString(tablo[0]));
        System.out.println("1.Satir=" + Arrays.toString(tablo[1]));
        System.out.println("2.Satir" + Arrays.toString(tablo[2]));


        // icindeki tek sayilari
        int[] tekler=new int[tekMiktar]; // buna doldurun


        int teklerIndex=0;
        for(int i=0; i< tablo.length; i++) {

            for(int j=0; j< tablo[i].length; j++)
                if(tablo[i][j] % 2 ==1) {
                    tekler[teklerIndex] = tablo[i][j];
                    teklerIndex++;
                }



    }
        System.out.println("tekler =" + Arrays.toString(tekler));
}


    }

