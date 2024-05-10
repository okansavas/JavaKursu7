package Gun32._03_Ornek;

import java.util.Scanner;

public class CampusMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);


        Okul yeniOkul=new Okul("Yunus Emre Ortaokulu", 3);

       do {
           System.out.println("Ogrenci adi"); String ad=okuStr.nextLine();
           System.out.println("Ogrenci soyadi"); String soyad=okuStr.nextLine();
           System.out.println("Ogrencinin yasi"); int yas=okuInt.nextInt();

           if (yas<15) {
               Ogrenci ogr=new Ogrenci(ad,soyad,yas);
               yeniOkul.getOgrencileri().add(ogr);
           }
           else
               System.out.println("Ogrenci yasi okul icin uygun degil");

       }while(yeniOkul.getOgrencileri().size() < yeniOkul.getKontenjan());

        for (Ogrenci o: yeniOkul.getOgrencileri())
            System.out.println("o = " + o);

    }
}
