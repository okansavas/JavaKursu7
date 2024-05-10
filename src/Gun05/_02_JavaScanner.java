package Gun05;

import java.util.Scanner;

public class _02_JavaScanner {
    public static void main(String[] args) {
         // tipi  adi    baslangic degeri
            int   sayi =  5;

            // tipi    adi      ilk degeri , arabalardan yeni araba
               Scanner okuyucu= new Scanner(System.in);
            // Bilgisayarlardan MyPc = yeni Bilgisayar();
            // System.in : klavyeden okuma görevi verildi okuyucuya
             System.out.println("Sayi giriniz=");
             int girilenSayi= okuyucu.nextInt(); // bu komutla sayi girilmesini bekliyor
             // okudugun sayiyi bana ver

        System.out.println("girilenSayi = " + girilenSayi);
        System.out.println("bitti");

    }
}
