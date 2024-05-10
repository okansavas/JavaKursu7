package Gun32._01_Encapsulation;

public class Kisi {

    String ad;
    String soyad;

    private int yas; // private yapip direkt erisimi kapatip
    // bir metod ile veriyi kontrol ederek atama
    // yapma islemine OOP nin 4 kuralindan biri olan
    // Kapsülleme, Encapsulation denir.



    public void setYas(int yas) {
        if (yas>0)
            this.yas=yas;
        else
            System.out.println("Böyle genclesemezsin.");

    }
    public int getYas() {
        return this.yas;
    }
}
