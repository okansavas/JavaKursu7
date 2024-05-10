package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {

        // 10/3 -> 3.333333   beklenen durum
        // bilgisayarin yaptigina gelelim
        // int/int -> tam sayi kismini verir. yani 10/3  -> 3
        // küsüratli sonuc istiyorsan en az birisi double olmali ki, bilgisayar küsüratli
        // sonuc versin.
        // double/int veya int/double veya double/double olmali -> 3.33333

        int sayi1=10;
        int sayi2=3;

        int tamSonuc = sayi1 / sayi2;  // int/int
        System.out.println("tamSonuc = " + tamSonuc);  // 3

        // eger küsüratli sonuc istiyorsam
        double doubleSonuc= sayi1/(double)sayi2;
        System.out.println("doubleSonuc = " + doubleSonuc); // 3.33333
    }
}
