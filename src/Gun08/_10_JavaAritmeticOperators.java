package Gun08;

public class _10_JavaAritmeticOperators {
    public static void main(String[] args) {

        int sayac = 0;


        sayac=sayac+1;  // sayacin degerini 1 artir : 1
        sayac++;  // sayacin degerini 1 artir : 2
        ++sayac; // sayacin degerini 1 artir : 3

        sayac=sayac-1 ; // sayacin degerini 1 azaltir : 2
        sayac--;  // sayacin degerini 1 azaltir : 1
        --sayac;  // sayacin degerini 1 azaltir: 0

        /*********************************/

        int toplam=0, sayi=5;
        toplam = toplam + sayi ; // toplam 5 degerini alir, sayi = 5 dir

        toplam = toplam + sayi++; // önce islemi yap, sonra sayi yi 1 artir
                                  // toplam = 10, sayi=6

        toplam=toplam+sayi;
        sayi=sayi+1;





    }
}
