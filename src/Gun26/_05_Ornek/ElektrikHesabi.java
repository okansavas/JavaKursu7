package Gun26._05_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=20;

    void tuketimEkle(int aylikTuketim) {
        this.toplamTuketim +=aylikTuketim;
        // this.toplamTuketim= this.toplamTuketim + aylikTuketim;
    }

    void faturaYaz(String ad) {
        double toplamTutar= this.toplamTuketim*this.birimFiyat;
        System.out.println("*******************");
        System.out.println("  Faturaniz  ");
        System.out.println("*******************");
        System.out.println("Musteri = " + ad);
        System.out.println("Toplam Tüketiminiz = " + this.toplamTuketim);
        System.out.println("Toplam Tutariniz = " + toplamTutar);
        System.out.println("*********************");
    }


}
