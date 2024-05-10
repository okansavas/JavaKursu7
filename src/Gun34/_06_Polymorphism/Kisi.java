package Gun34._06_Polymorphism;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public void kimlikYaz(Kisi gelenKisi) {
        System.out.println("\n***** Kimlik Belgesi ******");
        System.out.println("ad = " + gelenKisi.getAd());
        System.out.println("soyad = " + gelenKisi.getSoyad());
        System.out.println("görevi = " + gelenKisi.getGorev());

        if (gelenKisi instanceof Calisan)
            System.out.println("Departmani = " + ((Calisan)gelenKisi).getDepartman());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Departmani = " + ((Ogrenci)gelenKisi).getSube());
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
