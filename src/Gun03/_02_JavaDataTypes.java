package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafizada int kadar yer ayirir, sadece tam sayi atilir

        // tam sayilar
        byte byteDeger=7;  // -128, 127 arasi kadar olan sayilar icin kullanilir
        short shortDeger=1645;  //  -32000, 32000 arasi
        int intDeger=250000;  // -2.5 mil, +2,5 mil, java rakama gmrdügünde direkt int düsünür, DEFAULT
        long longDeger= 333344444444l;  // default olarak rakamlar i int kabul ettiginden
                                        // uzun rakamlarda mutlak sonuna l konulmali


        // küsüratli, ondalikli sayilar
        double doubleDeger=3.1432323217777; // noktadan sonra 16 hane hassasiyeti var, DEFAULT
        float floatDeger=3.141233f;  // Kararsiz degisken olarak adlandirildigi icin,
                                     // az yer kaplasa da tercih edilmez


        // kelime, harf
        char basHarf='A';   // harfler tek tirnak arasinda yazilir
        String isim="ismet";  // kelimeler sabit oldugundan cift tirnak arasinda yazilir

        // so ya bastiginizda soutv secilirse, degisken yazilacagini anlat ve kendisi formatli yazdirir
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);

        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);

        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);
    }
}
