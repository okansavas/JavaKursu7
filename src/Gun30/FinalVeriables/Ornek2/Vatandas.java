package Gun30.FinalVeriables.Ornek2;

public class Vatandas {
    String isim;
    String adres;
    final int TcNO;

    private static int TCNoSayac=1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.TcNO=TCNoSayac++;
    }
}
