package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        int toplam=6700; // 2.5 mil
        byte sayi= 5;   // 127

        sayi=(byte)toplam;  // int -> byte
        System.out.println("sayi = " + sayi);  // 6700 cikar mi? veri kaybi olur.

        double oran=3.7;
        toplam =(int)oran; // double -> int  // tam sayi kismini almak icin kullanilan bi yöntem
        System.out.println("toplam = " + toplam);
        // veri kaybi var, ondalik kisim kayboldu





    }
}
