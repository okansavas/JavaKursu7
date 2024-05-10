package Gun39;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni sifre olusturma");

        try {
            System.out.println("Yeni sifre=");
            String yeniSifre = oku.nextLine();

            if (yeniSifre.length() < 8)
                throw new Exception("Sifre en az 8 karakter olmali");
            if (yeniSifre.length() > 15)
                throw new Exception("Sifre en fazla 15 karakter olmali");
        } catch (Exception ex) {
            System.out.println("Lütfen Dikkat");
            System.out.println(ex.getMessage());
            // log tutma
            // hatali girme sayisi astiginda bloke etme islemi
            // eski sifrelerden birisi mi kontrol
        }

    }




    }

