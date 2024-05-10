package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin negatif mi, pozitif mi oldugunu yazdiriniz
        // Sifir ise sifir yazdiriniz.


        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi=");
        int sayi=oku.nextInt();

        if (sayi>0)
            System.out.println("pozitif");

        if (sayi<0)
            System.out.println("negatif");

        if (sayi==0)
            System.out.println("sifir");

        // {} parantezlerini her zaman kullanabilirsiniz ,
        // ancak if sarti saglandiginda calisacak tek bir komut var ise
        // kullanmak zorunlu degildir.








    }
}
