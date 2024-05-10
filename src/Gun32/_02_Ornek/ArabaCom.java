package Gun32._02_Ornek;

public class ArabaCom {
    public static void main(String[] args) {
        Araba a1=new Araba();
        a1.setModel(2004);
        a1.setRenk("Kirmizi");
        a1.setMotorHacmi(1400);
        a1.setKapiSayisi(9);

        System.out.println("a1 = " + a1);

        System.out.println("a1.getRenk() = " + a1.getRenk());
        System.out.println("a1.getModel() = " + a1.getModel());
        System.out.println("a1.getMotorHacmi() = " + a1.getMotorHacmi());
        System.out.println("a1.getKapiSayisi() = " + a1.getKapiSayisi());

        Araba a2=new Araba("siyah", 2023, 1500, 9);
        System.out.println("a2 = " + a2);




    }
}
