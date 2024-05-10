package Gun17;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
// 50 kisilik bir sinifin notlarini giriniz ve ortalamadan büyük
        // kac not oldugunu bulunuz ve bunlari yazdiriniz


        Scanner oku=new Scanner(System.in);
        int[] notlar= new int[50];  // 50 int sayi gibi

        int notToplam=0;
        for(int  i=0; i <notlar.length; i++) {

            System.out.print("Not giriniz=");
            notlar[i] = oku.nextInt();

            notToplam=notToplam+notlar[i];
        }

        int ort=notToplam/notlar.length;  // ortalama not bulundu
        System.out.println("ort = " + ort);

        int gecenler=0;
        for(int i=0; i<notlar.length; i++) {
            if(notlar[i] > ort) {
                System.out.println("notlar[i] = " + notlar[i]);
                gecenler++;
            }

            System.out.println("gecenler = " + gecenler);
        }




    }
}
