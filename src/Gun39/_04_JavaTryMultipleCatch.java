package Gun39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program Calismaya Basladi");

        Scanner oku=new Scanner(System.in);

        try {
            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.println("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

            // String kalem="";  // bu 2 satir Genel hata icin acilacak
            // char harf=kelime.charAt(3);
        }


         catch (InputMismatchException ex) // belirli bir hata
         {
             System.out.println("Lütfen Sayi Giriniz");
         }
        catch (ArithmeticException ex) // belirli bir hata
        {
            System.out.println("lütfen bölen icin sifir girmeyiniz");
        }
        catch (Exception ex) {  // genel kalan tüm hatalar, default
            System.out.println("Hata olustu, tekrar deneyiniz.");
        }



    }
}
