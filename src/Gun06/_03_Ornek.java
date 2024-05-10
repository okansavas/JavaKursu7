package Gun06;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanicidan agirligini(kg) double, boyunu(m) double olarak aliniz.
        // ve bir satirda boyunuz ... ve kilonuz ... seklinde yaziniz.
        // vucut kitle indexini de bularak yazdiriniz   kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz(kg)=");
        double kilo=oku.nextDouble();

        System.out.print("Boyunuzu Giriniz(m)=");
        double boy=oku.nextDouble();

        double kitleIndex= kilo / (boy*boy);
        System.out.println("Boyunuz="+boy+", kilonuz="+kilo);
        System.out.println("kitleIndex = " + kitleIndex);



    }
}
