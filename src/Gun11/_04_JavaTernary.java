package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanicinin girecegi sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi");
        int sayi=oku.nextInt();

        // normal yöntem
        if(sayi%2 == 0)
            System.out.println("Cift");
        else
            System.out.println("tek");

        // if - else icin kisa yöntem

        String sonuc= sayi %2 == 0  ? "Evet" : "Hayir";
        // ? if    : degilse
        System.out.println("sonuc = " + sonuc);



    }
}
