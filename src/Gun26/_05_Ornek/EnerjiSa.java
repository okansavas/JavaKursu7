package Gun26._05_Ornek;

public class EnerjiSa {
    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.name="Seyma Nur";
        // mus1: nesne
        // Musteri: tur, class, Tip

        mus1.eHesabi.tuketimEkle(100); // Ocak
        mus1.eHesabi.tuketimEkle(200); // Subat
        mus1.eHesabi.tuketimEkle(220); // Mart

        System.out.println("toplamTuketim = " + mus1.eHesabi.toplamTuketim);
        mus1.eHesabi.faturaYaz(mus1.name);





    }
}
