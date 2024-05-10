package Gun29.Protected.Protected1;

public class Doktor {
    public String hastaneAdi; // herkes
    String adi; // ayni pakettekiler

    protected String bolum; // ayni pakettekiler

    private String sicilNo; // sadece bu class in icindekiler

    Doktor() {  // kendi paketinden erisim

    }
    public Doktor(String adi) { // herkes
        this.adi=adi;
    }
}
