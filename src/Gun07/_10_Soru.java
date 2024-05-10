package Gun07;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadin(tam ad) adini ve soyadini ayirip,
        // ayri ayri yazdiriniz. (sadece ad ve soyad)
        // mesela Ismet Temur  -> Ismet i ayri yazdirin, Temur u yazdirin

        Scanner oku=new Scanner(System.in);

        System.out.println("Ad ve Soyad");
        String adSoyad= oku.nextLine();

        int boslukIndex = adSoyad.indexOf(" ");

        String ad= adSoyad.substring(0, boslukIndex);
        String soyad= adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);





    }
}
