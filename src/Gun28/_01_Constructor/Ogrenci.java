package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;

    Ogrenci() {   // yapici metodlar
        // nesnenin olusma aninda yapilacak
        System.out.println("nesne olusturuldu");
        // veya kendi adin su olsun
    }

    Ogrenci(int id, String ad, String soyad, int sinifi) { // yapici metodlar
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinifi=sinifi;

    }
}


    // metodlar eklenebiliyor

