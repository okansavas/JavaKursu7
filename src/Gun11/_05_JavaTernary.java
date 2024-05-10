package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Girilen sayi 50 den büyük ise "Büyük" , degilse "Degil" degerini
        // ekrana yazdiriniz. Ternary operator ile yapiniz

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi giriniz=");
        int sayi=oku.nextInt();

        String sonuc= sayi > 50 ? "Büyük" : "Degil";

        System.out.println("sonuc = " + sonuc);

        // int intSonuc= sayi > 50 ? 1 : 0;
        // boolean booleanSonuc= sayi > 50 ? true : false;




    }
}
