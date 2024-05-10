package Gun06;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {

        // Kullanicidan Cadde(string), Sokak(string), PostaKodu(int) ve ülke(string)
        // evSahibi(boolean) seklinde adres bilgisini alarak yazdiriniz.

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Scanner okuBool=new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde= okuStr.nextLine();

        System.out.println("Sokak=");
        String sokak= okuStr.nextLine();

        System.out.println("PostaKod=");
        String postaKod= okuInt.nextLine();

        System.out.println("Ülke=");
        String ulke=okuStr.nextLine();

        System.out.println("Ev Sahibi misiniz (t/f) =");
        boolean evSahibi= okuBool.nextBoolean();

        System.out.println(cadde+sokak+postaKod+ulke+evSahibi);



        
    }
}
