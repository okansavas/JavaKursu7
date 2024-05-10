package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{
    private double tazminat;


    public GenelMudur(String isim, double tabanAylik, int maasKatSayisi, double tazminat) {
        super(isim, tabanAylik, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return super.toString() + "tazminat=" + this.tazminat;
    }
}

