package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // Ögrencinin girilen bir notuna göre 50 den büyük-esit
        // ise gectiniz, kücük ise kaldiniz yazdiriniz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Notunuzu giriniz =");
        int not = oku.nextInt();


         // 1.yöntem bilgisayar bos yere yoruluyor
        if (not >= 50)
            System.out.println("Gectiniz");

        if (not < 50)
            System.out.println("Kaldiniz");

        // 2.yöntem olmasi gereken
        if (not >= 50)
            System.out.println("Gectiniz");

        else
            System.out.println("kaldiniz");
    }
}
