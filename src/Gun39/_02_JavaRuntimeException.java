package Gun39;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program Calismaya Basladi");

        Scanner oku=new Scanner(System.in);

        try {  // olay yeri inceleme, hata bölgesi
            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.println("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        }
        catch (Exception hata)  // olusan hatayi hata isimli degiskene atiyor
        {
            System.out.println("hata olustu");
            System.out.println(hata);
        }
        System.out.println("Program bitti");




    }
}
