package Gun21;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        // kullanicinin girecegi bir sayiya kadar olan sayilarin toplamini
        // bir fonksiyonda buldurup mainden yazdiriniz
        // 5 -> 1+2+3+4+5

        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = oku.nextInt();

//      1.Yöntem
        // int toplam=0;

        // for (int i = 1; i <= sayi; i++) {
        //    toplam=toplam +i;

        int toplam = toplamBul(sayi);


        System.out.println("toplam = " + toplam);
    }

    public static int toplamBul(int sayi)
    {
        int toplam=0;
        for (int i=1; i <= sayi; i++) {
            toplam= toplam+i;
        }

        return toplam;
    }
}
