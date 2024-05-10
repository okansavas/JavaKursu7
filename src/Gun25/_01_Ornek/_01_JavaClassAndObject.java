package Gun25._01_Ornek;


// tiplerin yani class larin tanimlandigi yer

import java.util.ArrayList;
import java.util.Scanner;

public class _01_JavaClassAndObject {


   // method
    public static void main(String[] args) {
   // ana mathod : programin basladigi ve bittigi yer
        int sayi;
        Scanner oku= new Scanner(System.in);
        ArrayList<Integer> liste=new ArrayList<>();


        Araba benimArabam= new Araba();
        benimArabam.renk="kirmizi";
        benimArabam.yili=2024;
        benimArabam.motorHacmi=1600;
        benimArabam.marka="Togg";

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.yili = " + benimArabam.yili);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.marka = " + benimArabam.marka);

    }
    // method
}

// tiplerin yani class larin tanimlandigi yer
class Araba {
int okulNo;
String renk;
int yili;
String marka;
int motorHacmi;
}
