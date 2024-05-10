package Gun33._03_Inheritance;

public class Calisan {
    private String isim;
    private double maas;
    private int maasKatSayisi;

    public Calisan(String isim, double maas, int maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getTabanAylik() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(int maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    public double maasHesapla() {
        return this.maas*this.maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                ", Net Maas=" + this.maasHesapla() +
                '}';
    }
}
