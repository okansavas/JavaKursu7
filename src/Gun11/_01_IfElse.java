package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunlugu 10 dan büyükse ve string icinde
        // "study" kelimesi(büyük veya kücük) geciyorsa ekrana evet
        // yazdirin degilse hayir yazdirin

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz=");
        String cumle=oku.nextLine();

        // 1. Yöntem

        if ( cumle.length() > 10  && cumle.toLowerCase().contains("study") )
        System.out.println("EVET");

        else
        System.out.println("HAYIR");

        // 2.Yöntem
        int uzunluk=cumle.length();
        boolean varMi= cumle.toLowerCase().contains("study");

        if (uzunluk > 10 && varMi)
            System.out.println("EVET");

        else
            System.out.println("HAYIR");













    }
}
