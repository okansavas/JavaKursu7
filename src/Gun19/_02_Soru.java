package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // 2x3 lük bir tabloyu random 10 a kadar sayilarla doldurunuz
        // Daha sonra kullanicidan bir sayi aliniz. Bu sayi tabloda
        // var ise yerini (satir, sutun) yazdiriniz.

        int[][] tablo=new int[2][3];

        // doldurma
        for(int i=0; i < tablo.length; i++) {

            for (int j =0; j< tablo[i].length; j++)
                tablo[i][j] = (int) (Math.random()*10);
        }
         // aranacak sayi kullanicidan alindi
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayi giriniz=");
        int arananSayi= oku.nextInt();


        // sayi tüm tablo elemanlarinda arandi
        for(int i=0; i < tablo.length; i++) {

            for(int j=0; j< tablo[i].length; j++)
                if (tablo[i][j] == arananSayi) {
                    System.out.println("satir,sutun="+i+","+j);
                }
        }

        // tablonun fotografi yazildi
        System.out.println("1.Satir=" + Arrays.toString(tablo[0]));
        System.out.println("2.Satir=" + Arrays.toString (tablo[1]));


    }
}
