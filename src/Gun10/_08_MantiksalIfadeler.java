package Gun10;

import java.util.Scanner;

public class _08_MantiksalIfadeler {
    public static void main(String[] args) {
        // mantiksal ifadeler
        // ve  &&
        // veya  ||

        //Soru : girilen bir sayi 0 dan büyük ve 100 den kucuk esit
        // ise gecerli not , degil ise gecerli olmayan not
        Scanner oku=new Scanner(System.in);

        System.out.print("OgrNot=");
        int ogrNot=oku.nextInt();

        if (0<ogrNot && ogrNot<=
                100 )
            System.out.println("Gecerli Not");

        else
            System.out.println("Gecerli Degil");



    }
}
