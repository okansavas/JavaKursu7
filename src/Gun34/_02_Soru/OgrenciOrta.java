package Gun34._02_Soru;

public class OgrenciOrta extends Ogrenci{
    public OgrenciOrta(String isim, OgrTip tipi, String sinav) {
        super(id, isim, tipi);
        setSinav(sinav);
    }
    private String sinav;

    public String getSinav() {
        return sinav;
    }

    public void setSinav(String sinav) {
        this.sinav = sinav;
    }

    @Override
    public String toString() {
        return super.toString()+", sinav="+this.sinav;
    }
}
