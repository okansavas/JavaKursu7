package Gun39;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni sifre olusturma");

        System.out.println("Yeni sifre=");
        String yeniSifre=oku.nextLine();

        if (yeniSifre.length() < 8) {
            System.out.println("Lütfen dikkat");
            System.out.println("Sifre en az 8 karakter olmali");
            // log tutma
            // hatali girme sayisi astiginda bloke etme islemi
            // eski sifrelerden birisi mi kontrol
        }

        if (yeniSifre.length() > 15) {
            System.out.println("Lütfen dikkat");
            System.out.println("Sifre en az 15 karakter olmali");
            // log tutma
            // hatali girme sayisi astiginda bloke etme islemi
            // eski sifrelerden birisi mi kontrol
        }



    }
}
