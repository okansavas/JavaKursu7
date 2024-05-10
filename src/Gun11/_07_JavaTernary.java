package Gun11;

import java.util.Scanner;

public class _07_JavaTernary {
    public static void main(String[] args) {

        // Otopark ücretleri : (Ternary operatoru ile yapiniz)
        // 3 saate kadar 50 TL, 5 saate kadar 100 tl, 5 den buyukse 120 tl dir
        // kullanicidan kac saat kaldigini alarak ucreti yazdiriniz

        // eger saat < 3 ise 50 tl yaz
        // eger saat >=3 ise ve saat < 5 ise 100 tl yaz
        // eger saat >= 5 ise 120 tl yaz

        Scanner oku= new Scanner(System.in);
        System.out.println("Saat=");
        int saat=oku.nextInt();

        // String olarak       ? -> if      : -> else
        String strUcret= (saat < 3 ? "50tl" : ( saat < 5 ? "100tl" : "120 tl"));

        System.out.println("strUcret = " + strUcret);

        // int olarak
        int ucret = (saat < 3 ? 50 : (saat < 5 ? 100 : 120));

        System.out.println("ucret = " + ucret);
        



    }
}
