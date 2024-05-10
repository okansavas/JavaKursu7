package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.println("Sifre =");
        String sifre=oku.nextLine();

        System.out.println("Sifre Tekrar =");
        String sifreTekrar=oku.nextLine();

        boolean esitMi = sifre.equals(sifreTekrar);

        if (esitMi)
            System.out.println("Esit");

        if (!esitMi)
            System.out.println("Degil");




    }
}
