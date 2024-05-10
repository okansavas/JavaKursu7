package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi k=new Kedi("siyah", 3, "tekir");

        System.out.println("k.getRenk() = " + k.getRenk());

     k.konustu();

     Kopek kp=new Kopek("beyaz", 50,"kangal");
        System.out.println("Cinsi = " + kp.getCinsi());
        kp.konustu();

        Ordek o=new Ordek("yesil", 3, "gövel", 90 );
        System.out.println(o.getCinsi());
        o.konustu();

        Yilan y=new Yilan("siyah", 10, "engerek", 300);
        System.out.println(y.getCinsi());
        System.out.println(y);
        y.konustu();





    }
}
