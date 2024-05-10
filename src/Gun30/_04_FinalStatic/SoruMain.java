package Gun30._04_FinalStatic;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {

        //  Sabitler s=new Sabitler();
        // int a= s.birGundekiSaatSayisi;
        //int b=Sabitler.birGündekiSaatSayisi;

        int gun;
        int saat;
        int dak;

        Scanner oku = new Scanner(System.in);
        System.out.println("Gun="); gun= oku.nextInt();
        System.out.println("Saat="); saat= oku.nextInt();
        System.out.println("Dakika="); dak= oku.nextInt();

        int toplamSaniye=Sabitler.hesapla(gun,saat,dak);
        System.out.println("toplamSaniye = " + toplamSaniye);

    }
}