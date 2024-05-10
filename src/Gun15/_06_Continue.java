package Gun15;

import java.util.Scanner;

public class _06_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker
        // ekrana alt alta olacak
        // sekilde yazdiriniz, bosluklari yazmasin

        Scanner oku = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle = oku.nextLine();

        // bugün hava cok güzel 0-> lendgth-1

        for (int i = 0; i < cumle.length(); i++) {
            char harf = cumle.charAt(i); //0,1,2,3,4

            if (harf == ' ') continue;

            System.out.println("harf = " + harf);


        }
    }
}