package Gun10;

import java.util.Scanner;

public class _09_IfElse {
    public static void main(String[] args) {
        // Girilen sayi pozitif ve tek ise , ekrana uygun sayi girildi
        // degilse uygun sayi girilmedi seklinde yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi");
        int sayi=oku.nextInt();

        // int kalan=sayi%2;

        if(sayi>0 && (sayi&2)==1)
            System.out.println("Uygun sayi girildi");

        else
            System.out.println("Uygun sayi girilmedi");



    }
}
