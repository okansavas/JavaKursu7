package Gun13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        // Girilen 6 sayidan sadece pozitif olanlarinin
        // toplamini bulunuz

        Scanner oku=new Scanner(System.in);
        int sayac=0, toplam=0 ;

        while (sayac < 6) {
            System.out.println("Sayi Giriniz=");
            int sayi= oku.nextInt();

            if (sayi>0)
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);



    }
}
