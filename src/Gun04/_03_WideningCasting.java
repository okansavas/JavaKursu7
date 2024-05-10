package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // 1. kücük alani -> buyuge atilabiliyor (genisleme-Widening)
        // byte-> short -> int-> long-> float -> double
        // veri kaybi kesinlikle yok

        int sayi=9;
        long toplam=500;
        double oran= 3.2; // sayilari onemli degil burda

        //sol taraf deger alan taraftir, sag taraf deger veren taraftir
        oran = sayi; // int -> double genisleme yönünde
        System.out.println("oran = " + oran); // veri kaybi ihtimali yok

        toplam=sayi; // int -> long genisleme yönünde
        System.out.println("toplam = " + toplam); // veri kaybi ihtimali yok

        oran = toplam; // long -> double genisleme yönünde
        System.out.println("oran = " + oran); // veri kaybi ihtimali yok

        
    }
}
