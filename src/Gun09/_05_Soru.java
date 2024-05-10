package Gun09;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // kullanicinin girecegi 2 sayinin birbirine
        // esit mi olup olmadigini yazdiriniz

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi1=");
        int sayi1=oku.nextInt();

        System.out.println("Sayi2=");
        int sayi2=oku.nextInt();

        System.out.println("Esit Mi" + (sayi1==sayi2));  // 1.yöntem


        boolean esitMi= (sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);  // 2.yöntem






    }
}
