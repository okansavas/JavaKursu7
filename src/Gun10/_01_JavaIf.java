package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz
        // tek veya cift seklinde yazdiriniz

        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi Giriniz =");
        int sayi = oku.nextInt();

        if ((sayi%2) ==1 )
        System.out.print("Sayi tektir");

        if ((sayi%2) ==0 )
            System.out.print("Sayi Cifttir");



    }
}
