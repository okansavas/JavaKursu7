package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // bir dikdörtgen tarlanin gerekli kenar(int) uzunluklarini kullanicidan
        // isteyip cevresini ve alanini bulunuz ve yazdiriniz.
        // cevre=a+b+a+b   alan=a*b

        Scanner oku= new Scanner(System.in);

        System.out.print("Uzun kenari giriniz:");
        int uzunKenar=oku.nextInt();

        System.out.print("Kisa kenari giriniz:");
        int kisaKenar=oku.nextInt();

        int cevre=uzunKenar + uzunKenar + kisaKenar + kisaKenar;
        int alan= uzunKenar * kisaKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

        // ctrl+z   -> yapilan islemi geri alir
        // ctrl+y   -> geri alinmis islemleri tekrar yazar




    }
}
