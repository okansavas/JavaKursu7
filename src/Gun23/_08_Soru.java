package Gun23;

import java.util.HashSet;

public class _08_Soru {
    public static void main(String[] args) {
        // 1 den 20 ye kadar (20 dahil) olan sayilardan random olarak
        // tekrar olmayacak sekilde 10 tanesini bir diziye atayiniz
        // yani 10 tane random sayi istiyoruz ama icinde tekrar
        // olmayacak

        HashSet<Integer> sayilar=new HashSet<>();

        while( sayilar.size() < 10) { // 10 oldugunda duracak

            int rndSayi=(int)(Math.random()*21);
            sayilar.add(rndSayi);

        }
        System.out.println("sayilar = " + sayilar);




    }
}
