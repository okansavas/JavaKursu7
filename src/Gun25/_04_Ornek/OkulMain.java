package Gun25._04_Ornek;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);
        Ogrenci ogr1= new Ogrenci();

        System.out.println("Ögrenci Adi=");ogr1.adi=okuStr.nextLine();
        System.out.println("Ögrenci Adi=");ogr1.soyadi=okuStr.nextLine();
        System.out.println("Ögrenci Adi=");ogr1.sinifi=okuInt.nextInt();
        System.out.println("Ögrenci Adi=");ogr1.adres=okuStr.nextLine();

        System.out.println("ogr1 = " + ogr1.adi);
        System.out.println("ogr1 = " + ogr1.soyadi);
        System.out.println("ogr1 = " + ogr1.sinifi);
        System.out.println("ogr1 = " + ogr1.adres);






    }


}
