package Gun25._05_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1= new Ogrenci();
        Ogrenci ogr2= new Ogrenci();
        Ogrenci ogr3= new Ogrenci();


        Ogrenci[] sinif=new Ogrenci[3];  // ici bos su anda ögrenci tipi var burda
        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);

        for (int i = 0; i < sinif.length; i++) {
            Ogrenci ogr=new Ogrenci();  // sinif[i]=new Ogrenci();
            System.out.println("Ögrenci Adi=");sinif[i].ad=okuStr.nextLine();
            System.out.println("Ögrenci Adi=");sinif[i].soyad=okuStr.nextLine();
            System.out.println("Ögrenci Adi=");sinif[i].sinif=okuInt.nextInt();
            System.out.println("Ögrenci Adi=");sinif[i].adres=okuStr.nextLine();
            sinif[i]=ogr;
        }

        for (int i = 0; i < sinif.length; i++) {
            System.out.println("ogr1 = " + sinif[i].ad);
            System.out.println("ogr1 = " + sinif[i].soyad);
            System.out.println("ogr1 = " + sinif[i].sinif);
            System.out.println("ogr1 = " + sinif[i].adres);


        }

/*****************************************/
      ArrayList<Integer> notlar=new ArrayList<>();  // istedigin kadar Integer ekle
      ArrayList<Ogrenci> sinif2=new ArrayList<>();  // istedigin kadar Ogrenci ekle
        for (int i = 0; i < 3; i++) {
        }
            Ogrenci ogr=new Ogrenci();  // sinif[i]=new Ogrenci();
            System.out.println("Ögrenci Adi=");ogr.ad=okuStr.nextLine();
            System.out.println("Ögrenci Adi=");ogr.soyad=okuStr.nextLine();
            System.out.println("Ögrenci Adi=");ogr.sinif=okuInt.nextInt();
            System.out.println("Ögrenci Adi=");ogr.adres=okuStr.nextLine();
            sinif2.add(ogr);

    }
    for(Ogrenci ogr: sinif2){
        System.out.println("ogr1.adi = " + ogr.ad);
        System.out.println("ogr1.soyadi = " + ogr.soyad);
        System.out.println("ogr1.sinifi = " + ogr.sinif);
        System.out.println("ogr1.adresi = " + ogr.adres);


    }

}
