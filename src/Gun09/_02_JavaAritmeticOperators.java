package Gun09;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {
        int toplam = 0, sayi = 1;

        toplam= toplam+sayi;   // toplama sayiyi ekle : 1 oldu toplam
        sayi= sayi+1;  // sayiyi 1 artir

        // bu iki satiri tek satirda yazabilirsin diyor
        toplam=0; sayi=1;  // baslangic degerlerine getirildi

        toplam = toplam + sayi++;   //toplam=1, sayi=2
        // ++ sadece sayiyi etkiler

        /************************************************/
        toplam=0; sayi=1;  // baslangic degerlerine getirildi

        sayi=sayi+1;
        toplam=toplam+sayi;          // sayi=2,  toplam=2

        //bu iki satir yerine tek satirda söyle yazabilirsin
        toplam=0; sayi=1;  // baslangic degerlerine getirildi

        toplam= toplam +  ++sayi;

        // ++ sonra ise, önce islem, sonra artis
        // ++ önce ise, önce artis, sonra islem







    }
}
