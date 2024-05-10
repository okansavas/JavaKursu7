package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 50 TL, 5 saate kadar 100 tl, 5 den buyukse 120 tl dir
        // kullanicidan kac saat kaldigini alarak ucreti yazdiriniz

        // eger saat < 3 ise 50 tl yaz
        // eger saat >=3 ise ve saat < 5 ise 100 tl yaz
        // eger saat >= 5 ise 120 tl yaz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir saat giriniz=");
        int saat=oku.nextInt();

        if (saat>3)
            System.out.println("Ücret=50 TL");

        if (saat>=3 && saat < 5)
            System.out.println("Ücret=100 TL");

        if (saat >= 5)
            System.out.println("Ücret= 120 TL");

        // if ve else li hali

        if (saat <3 )
            System.out.println("Ücret=50TL");
        else {
            if (saat < 5)
                System.out.println("Ücret = 100 tl");
            else
                System.out.println("120 tl");
        }


    }
}
