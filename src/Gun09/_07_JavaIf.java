package Gun09;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Baklava dilimi, if
        // Girilen bir sayi 10 dan büyük ise "10 dan büyük yaziniz"
        // 1- Basla
        // 2- sayi oku
        // 3- sayi > 10 ise "10 dan büyük yaz"
        // 4- dur

        // 2- sayi oku
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi=");
        int sayi=oku.nextInt();

        // 3- sayi > 10 ise
        if (sayi>10)
        {
            System.out.println("10 dan büyük"); // 10 dan büyük yaz

        } // curly braces deniyor bu isarete

    } // 4-dur
}
