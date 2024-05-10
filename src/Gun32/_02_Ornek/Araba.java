package Gun32._02_Ornek;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
        //this.renk = renk;
        //this.model = model;
        //this.motorHacmi = motorHacmi;
        //this.kapiSayisi = kapiSayisi;
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
        //buradaki acik noktayi set fonksiyonlarini cagirarak kapattik
        // diger bir deyisle acik kapilari kapatalim
    }

    public Araba() {

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if(kapiSayisi<=7)
              this.kapiSayisi = kapiSayisi;
        else
            System.out.println("hatali kapi sayisi");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}

