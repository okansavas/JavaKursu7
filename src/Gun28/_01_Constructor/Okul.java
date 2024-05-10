package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci(); //nesnenin olusma ani

        ogr1.id=1001;
        ogr1.ad="Ismet";
        ogr1.soyad="Temur";
        ogr1.sinifi=5;

        System.out.println(ogr1.ad);

        Ogrenci ogr2=new Ogrenci(1, "mehmet", "selek", 6);
        System.out.println(ogr2.ad);


        }


    }

