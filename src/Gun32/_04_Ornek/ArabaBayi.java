package Gun32._04_Ornek;

import java.util.ArrayList;

public class ArabaBayi {
    String bayiAd;
    String maxAracYeri;
    ArrayList<Araba> arabalari=new ArrayList<>();

    public ArabaBayi(String bayiAd, String maxAracYeri, ArrayList<Araba> arabalari) {
        this.bayiAd = bayiAd;
        this.maxAracYeri = maxAracYeri;
        this.arabalari = arabalari;
    }

    public String getBayiAd() {
        return bayiAd;
    }

    public void setBayiAd(String bayiAd) {
        this.bayiAd = bayiAd;
    }

    public String getMaxAracYeri() {
        return maxAracYeri;
    }

    public void setMaxAracYeri(String maxAracYeri) {
        this.maxAracYeri = maxAracYeri;
    }

    public ArrayList<Araba> getArabalari() {
        return arabalari;
    }

    public void setArabalari(ArrayList<Araba> arabalari) {
        this.arabalari = arabalari;
    }

    @Override
    public String toString() {
        return "ArabaBayi{" +
                "bayiAd='" + bayiAd + '\'' +
                ", maxAracYeri='" + maxAracYeri + '\'' +
                ", arabalari=" + arabalari +
                '}';
    }
}
