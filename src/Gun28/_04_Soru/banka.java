package Gun28._04_Soru;

public class banka {

    String adi;

    int subeSayisi;

    int kurulusYili;

    public banka() {
    }

    public banka(String adi) {
        this.adi = adi;
    }

    public banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    @Override
    public String toString() {
        return "banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}


