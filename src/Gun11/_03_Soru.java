package Gun11;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // yan yana aralarinda bir boslukla girilen 2 int sayinin
        // birbirine esit olup olmadigini bulunuz
        // 45 67

        Scanner oku=new Scanner(System.in);
        System.out.println("Yan yana bir bosluk ile 2 adet sayi giriniz=");
        String strSayilar=oku.nextLine(); // 4567 6

        int boslukIndex= strSayilar.indexOf(" ");
        String strsayi1=strSayilar.substring(0, boslukIndex);
        String strsayi2=strSayilar.substring(boslukIndex+1);

        int sayi1= Integer.parseInt(strsayi1);
        int sayi2= Integer.parseInt(strsayi2);

        if (sayi1==sayi2)
            System.out.println("ESIT");

        else
            System.out.println("DEGIL");




    }
}
