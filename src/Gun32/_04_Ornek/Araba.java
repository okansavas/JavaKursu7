package Gun32._04_Ornek;

public class Araba {
    private int model;
    private String marka;
    private int fiyat;


    public Araba(int model, String marka, int fiyat) {
        this.model=model;
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model=" + model +
                ", marka='" + marka + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
