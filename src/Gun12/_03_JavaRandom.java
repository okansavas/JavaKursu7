package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {
        // (int) (Math.Random()*10)  -> 0-9, 0-19, 0-29
        // 20-30 arasini istiyorum desen => 10 a kadar üret sonra 20 ekle
        // 1) aralik kadar üret  0 - 9
        // 2) min umumu cikan sonuca ekle: 20-29

        // Girilen min ve max araligi sayi uretiniz
        Scanner oku=new Scanner(System.in);
        System.out.println("min (alt sinir) =");
        int min=oku.nextInt();

        System.out.println("max (ust sinir) =");
        int max=oku.nextInt();

        int rndSayi= (int)(Math.random()*(max-min)) + min;
        // aralik kadar üret, sonra min i ekle
        System.out.println("rndSayi = " + rndSayi);





    }
}
