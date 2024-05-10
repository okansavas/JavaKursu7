package Gun34._06_Polymorphism;

public class Ogrenci extends Kisi{
    private String sube;

    public Ogrenci(String ad, String soyad, String gorev, String sube) {
        super(ad, soyad, gorev);
        setSube(sube);
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
