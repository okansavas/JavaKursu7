package Gun20;

import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanicinin girecegi 2 sayidan büyük bulma islemini bir metodda
        // yaptiktan sonra main de yazdiriniz

        Scanner oku = new Scanner(System.in);

        System.out.println("1.Sayi=");
        int sayi1 = oku.nextInt();

        System.out.println("2.Sayi");
        int sayi2 = oku.nextInt();

        // int enb= Math.max(sayi1, sayi2)

        int enb = enbBul(sayi1, sayi2);
        System.out.println("enb" + enb);
    }

    public static int enbBul(int s1, int s2) {
        return (s1 > s2 ? s1 : s2);

    }

}


