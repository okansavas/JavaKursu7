package Gun25._02_Ornek;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1001;
        ogr1.adi="Kaan";
        ogr1.soyadi="Gül";
        ogr1.adresi="Üsküdar";
        ogr1.sinifi=12;

        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("ogr1 = " + ogr1.adi);
        System.out.println("ogr1 = " + ogr1.soyadi);
        System.out.println("ogr1 = " + ogr1.sinifi);
        System.out.println("ogr1 = " + ogr1.adresi);


    }
}

class Ogrenci {
    String adi;
    String soyadi;
    int sinifi;
    int okulNo;
    String adresi;





}
