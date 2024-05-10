package Gun34._03_Protected.Paket1;

public class P1Hayvan {
    public String ad; // her yerden
    int yas; // sadece kendi paketinden
    protected String cinsi;  // sadece kendi paketinden + extend edilen diger paketlerden
    private String renk;  // sadece class in icinde
}
