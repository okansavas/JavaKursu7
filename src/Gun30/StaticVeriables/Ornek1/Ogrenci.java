package Gun30.StaticVeriables.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yildirim Ilkokulu";   //sen bir tanesin, biriciksin
                                                //bir sinifta sürekli tekrar eden sabit bir sey varsa static kullaniyoruz
                                                //hepsi için geçerli tek bir tane eleman
                                                //Tekrarlayan ve tum nesneler için kullanılacak
                                                //değişkenler için STATIC kullanıyoruz.
                                                //static=sen bir tanesin
                                                //static varsa hafızadan tasarruf sağlar.
                                                // hepsine atanır, tek olarak hafızada bulunur
                                                //tipin, sınıfın, classın değişkeni oldu
    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
}
