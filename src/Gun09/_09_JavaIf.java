package Gun09;

import java.util.Scanner;

public class _09_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayidan büyük olaninin degerini ekrana yazdiriniz
        // esit ise esit yazdiriniz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi 1 =");
        int sayi1 = oku.nextInt();

        System.out.print("Sayi2 =");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("sayi 1 büyük" + sayi1);

        if (sayi1 < sayi2)
            System.out.println("sayi 2 büyük" + sayi2);

        if (sayi1==sayi2)
            System.out.println("sayi1 ve sayi2 esit");




    }
}
