package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen 5 tam sayinin toplaminin sonucunu yazdiriniz.

        Scanner oku=new Scanner(System.in);
         int sayac=0, toplam=0 ;

         while (sayac < 5) {
             System.out.println("Sayi Giriniz=");
             int sayi= oku.nextInt();

             toplam=toplam+sayi;
             sayac++;
         }
        System.out.println("toplam = " + toplam);



    }
}
