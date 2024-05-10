package Gun20;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // girilen 2 sayidan büyük olanini yazdiriniz

        enBuyukYaz(); // hem okuyacak, hem de yazacak
enBuyukYaz(50, 60); // birden fazla parametre kullanimi
    }

    public static void enBuyukYaz(int s1, int s2) {
        if(s1>s2)
            System.out.println(s1 + "büyük");
        else
        if (s1<s2)
            System.out.println(s2 + "büyük");
        else
            System.out.println("esit");



    }





    public static void enBuyukYaz() {
        Scanner oku=new Scanner(System.in);
        System.out.println("1.Sayi Giriniz=");
        int s1= oku.nextInt();
        System.out.println("2.Sayi Giriniz");
        int s2=oku.nextInt();

        if(s1>s2)
            System.out.println(s1 + "büyük");
        else
            if (s1<s2)
                System.out.println(s2 + "büyük");
            else
                System.out.println("esit");



    }
}
