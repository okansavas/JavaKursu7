package Gun26._02_Ornek;

public class Kampus {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();

        ogr1.okulNo=1001;
        ogr1.ad="Ismet";
        ogr1.soyad="Temur";
        ogr1.okulAd="Bayrak Okulu";
        ogr1.okulu.okulAd="Bayrak Okulu";
        ogr1.okulu.mudurAd="Seyma Nur";
        ogr1.okulu.adres="Cekmeköy";

        Ogrenci ogr2= new Ogrenci();

        ogr2.okulNo=1002;
        ogr2.ad="Ömer";
        ogr2.soyad="Faruk";

        // ogr2.okulu=new Okul(); // ya tanimda ya burda

        ogr2.okulu.okulAd="Atatürk Okulu";
        ogr2.okulu.mudurAd="Ahmet Kaya";
        ogr2.okulu.adres="Sisli";

        System.out.println(ogr1.ad);
        System.out.println(ogr1.okulu.okulAd);




    }
}
