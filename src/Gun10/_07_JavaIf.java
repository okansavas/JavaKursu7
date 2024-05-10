package Gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner oku=new Scanner(System.in);

        System.out.println("sayi");
        int sayi=oku.nextInt();

        // 1. Yöntem
        int kalan= sayi % 2;

        if (kalan==0)
            System.out.println("Cift sayi");
        else
            System.out.println("tek sayi");

        // 2.Yöntem

        if (sayi%2==0)
            System.out.println("Cift sayi");
        else
            System.out.println("tek sayi");





    }
}
