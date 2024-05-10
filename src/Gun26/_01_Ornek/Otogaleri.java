package Gun26._01_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Otogaleri {
    public static void main(String[] args) {


        ArrayList<Araba> galeri = new ArrayList<>();

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Araba a = new Araba();
            System.out.println("Araba No=");
            a.ArabaNo = okuInt.nextInt();
            System.out.println("Araba Markasi=");
            a.marka = okuStr.nextLine();
            System.out.println("Araba Üretim Yili");
            a.uretimYili = okuInt.nextInt();

            galeri.add(a);

        }

        galeriYazdir(galeri);  // gideni var, döneni yok
        uretimYiliortalamasiYaz(galeri); // gideni var, döneni yok
        int ort = uretimYiliortalamasiBulVer(galeri); // gideni var, var
        System.out.println("ort = " + ort);

    }

    public static void galeriYazdir(ArrayList<Araba> galeri) {

        for (Araba a : galeri)
            System.out.println(a.ArabaNo + " " + a.marka + " " + a.uretimYili);
    }

    public static void uretimYiliortalamasiYaz(ArrayList<Araba> galeri) {
        int toplamUretimYili = 0;
        for (Araba a : galeri)
            toplamUretimYili = toplamUretimYili + a.uretimYili;

        System.out.println("Ortalama=" + (toplamUretimYili / galeri.size()));
    }

    public static int uretimYiliortalamasiBulVer(ArrayList<Araba> galeri) {
        int toplamUretimYili = 0;
        for (Araba a : galeri)
            toplamUretimYili = toplamUretimYili + a.uretimYili;

        return toplamUretimYili / galeri.size();

    }
}


