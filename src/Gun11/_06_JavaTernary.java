package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi giriniz=");
        int sayi=oku.nextInt();

        String sonuc = sayi == 0 ? "Sifir" : ( sayi > 0 ? "pozitif" : "negatif");

        System.out.println("sonuc = " + sonuc);




    }
}
