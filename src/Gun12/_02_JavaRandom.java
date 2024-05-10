package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayiya kadar random sayi üreterek tahmin etmeye calisiniz
        // kullanici bilirse tebrikler yaziniz.
        // mesela 5 girersem 5 e kadar sayi üretsin, ben tahmin etmeye calisayim

        Scanner oku=new Scanner(System.in);
        System.out.println("Üretilecek sayi siniri=");
        int sinir=oku.nextInt();

        int tutulanSayi=(int)(Math.random()*sinir);

        System.out.println("Tahmininiz=");
        int tahmin=oku.nextInt();

        if (tutulanSayi == tahmin)
            System.out.println("Tebrikler bildiniz");
        else
            System.out.println("Bilemedin"+tutulanSayi);




    }
}
