package Gun30._04_FinalStatic;

public class Sabitler {

    static final int birGundekiSaatSayisi= 24;
    static final int birSaattakiDakikaSayisi= 60;
    static final int birDakikadakiSaniyeSayisi= 60;

    public static int hesapla(int gun, int saat, int dak) {
        int toplamSaniye= gun * Sabitler.birGundekiSaatSayisi * Sabitler.birSaattakiDakikaSayisi * Sabitler.birSaattakiDakikaSayisi
                         + saat * Sabitler.birSaattakiDakikaSayisi * Sabitler.birDakikadakiSaniyeSayisi +
                          dak * Sabitler.birDakikadakiSaniyeSayisi;

        return toplamSaniye;


    }
}
