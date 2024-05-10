package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Girilen bir adi ekrana tekrar yazdiriniz.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adinizi Giriniz=");
        String ad=oku.next();  // next() bir kelime okur

        System.out.println("ad = " + ad);

        /*
             oku.next();      -> bir kelime okur
             oku.nextLine();   -> satirin tümünü okur

             oku.nextInt();   -> bir tam sayi okur
             oku.nextShort();  -> bir short tam sayi okur
             oku.nextByte();  -> bir byte tam sayi okur
             oku.nextLong();  -> bir long tam sayi okur

             oku.nextFloat(); -> bir kusuratli sayi okur
             oku.nextDouble(); -> bir kusuratli uzun sayi okur

             oku.nextBoolean(); -> bir boolean deger okur (true/false)


             */



    }
}
