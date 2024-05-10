package Gun05;

import java.awt.*;
import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanicidan Adini ve soyadini ayri ayri okutarak alip
        // birlikte ekrana yazdiriniz.

        Scanner oku= new Scanner(System.in);

        System.out.print("Adiniz=");
        String ad= oku.nextLine();

        System.out.print("Soyadin=");
        String soyad= oku.nextLine();

        System.out.println("Adiniz ve Soyadiniz= " + ad+" "+soyad);
        
    }
}
