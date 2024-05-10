package Gun03;

public class _01_Degiskenler {
    public static void main(String[] args) {
        // ctrl+alt+l  yazilari duzeltir

        int toplam;  // degisken tanimlanirken ilk deger vermek mecburi degil
        int sayac = 0; // degisken tanimlanirken ilk deger verilebilir

        sayac = sayac + 2;  // 2
        System.out.println("sayac="+ sayac); // sayac=2
        // + isareti rakamlar arasinda olursa toplar
        // + isareti bir kelime ile beraber kullanilirsa yanina ekler

        System.out.println(); // islem sonrasi satir, burada islem yok, o zaman alt satira gec
        System.out.println("merhaba"); // sabit yaziyi ekrana yazar
        System.out.println("sayac"); // ekrana sabit sayac kelimesini yazar
        System.out.println(sayac); // ekrana sayac isimli degiskenin degerini yazar

        System.out.println("sayac="+sayac);
    }
}
