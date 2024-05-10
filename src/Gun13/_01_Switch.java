package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
// Girilen 2 tam sayiyi kullanicidan aldiktan sonra,
        // Toplama icin T, Cikarma icin C, carpma icin P, bölme icin B
        // harflerini yine kullanicidan alarak istege uygun olan
        // islemi yaptirip sonucu yazdiriniz.

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        System.out.print("1.sayi =");
        int sayi1=okuInt.nextInt(); // 15

        System.out.print("2.sayi=");
        int sayi2=okuStr.nextInt();  // 3

        System.out.println("Toplama icin T");
        System.out.println("Cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bölme icin B");
        System.out.print("Seciminiz=");
        String seciminiz=okuStr.next().toUpperCase();  // T,C,P,B

        if (seciminiz.equalsIgnoreCase("T"))
            System.out.println("Toplama =" + (sayi1 + sayi2));
        else
          if (seciminiz.equalsIgnoreCase("C"))
            System.out.println("Cikarma = " + (sayi1 - sayi2));
          else
             if (seciminiz.equalsIgnoreCase("P"))
              System.out.println("Carpma =" + (sayi1*sayi2));
             else
              System.out.println("Bölme =" + ((double)sayi1 / sayi2));

        // string ifadelerin esitligi equals ile kontrol edilmeli


        switch (seciminiz) {
            case "T" : System.out.println("Toplama =" + (sayi1 + sayi2)); break;
            case "C" : System.out.println("Cikarma = " + (sayi1 - sayi2));break;
            case "P" :  System.out.println("Carpma =" + (sayi1*sayi2));break;
            case "B" : System.out.println("Bölme =" + ((double)sayi1 / sayi2));break;
            default: System.out.println("Hatali Giris Yaptiniz"); break;
        }

        // Calisma Mantigi: seciminiz T ye esitse case deki karsiligini yap ve cik (break)
        // default: diger sartlar gerceklesmediyse, yukaridaki tüm case lerin ELSE si gibi



    }
}
