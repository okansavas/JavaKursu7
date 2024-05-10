package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {
        int sayi=0;  // int: tipi, sayi: degiskenin adi, 0: baslangic degeri

        String ad="ismet";

        System.out.println("sayi = " + sayi);  // sayi = 0
        System.out.println("ad = " + ad);     // ad = ismet

        String soyad="Temur";
        System.out.println("soyad = " + soyad); // soyad = Temur

        String tamAd = ad+" "+soyad;  // + sayilarda toplama, kelimelerde ekleme
        System.out.println("tamAd = " + tamAd); // tamAd = ismet Temur

        System.out.println("tamAd = " + ad +" "+soyad); // 2.yöntem

    }
}
