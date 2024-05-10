package Gun30._03_Ornek;

public class GununSorusu {

    int a; // her nesnenin a si var

    static int b=0;  // sen bi tanesin, tipe ait sadece 1 tane

    void arttir() {
        a++;
        b++;
    }


    public static void main (String() args) {

        GununSorusu gs1= new GununSorusu();
        gs1.a=5;

        GununSorusu gs2= new GununSorusu();
        gs2.a=7;

        // Soru1: a nin degeri su anda kac oldu?
        // a yi yazdirsam kac yazar
        // Verilecek cevap su: Hocam hangi a yi soruyorsun,
        System.out.println("gs1.a = " + gs1.a); // 5, b=0
        System.out.println("gs2.a = " + gs2.a); // 7, b=0

        // Soru2: b nin degeri su anda kactir?
        System.out.println("GununSorusu.b = " + GununSorusu.b); // 0

        // Soru3:
        gs1.arttir();  // gs1.a si 1 tane artti: 6, b 1 artti
        gs2.arttir();  // gs2.a si 1 tane artti: 8, b 1 artti
        // su anda a nin be nin degeri kactir

        System.out.println("gs1.a = " + gs1.a); // 6
        System.out.println("gs2.a = " + gs2.a); // 8
        System.out.println("GununSorusu.b = " + GununSorusu.b); // 2






    }
}
