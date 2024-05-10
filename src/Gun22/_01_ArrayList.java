package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemani
        // Array i siralarken Arrays.sort u kullandigimiz gibi,
        // ArrayList i Collection metodlarini kullanacagiz.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        // Siralama Islemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);
        
        // Tersine cevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Max ve Min
        System.out.println("max() = " + Collections.max(sayilar));
        System.out.println("min() = " + Collections.min(sayilar));

        // Bir deger ile bütün elemanlari doldurma
        Collections.fill(sayilar, 0); // 0 degerini bütün elemanlara ver
        System.out.println("sayilar = " + sayilar);

        // istenen elemani istenen degerle degistirme
        Collections.replaceAll(sayilar, 0, 5);
        System.out.println("sayilar = " + sayilar);

        // tanimlarken deger atama
        ArrayList<Integer> liste= new ArrayList<>(Arrays.asList(3, 45, 6, 7, 8));
        System.out.println("liste = " + liste);

        ArrayList<String> liste2= new ArrayList<>(Arrays.asList("ismet", "mehmet", "Ayse"));
        System.out.println("liste2 = " + liste2);

        // bir liste coklu eleman ekleme
        Collections.addAll(liste, 3,4,5,6,7 );
        System.out.println("liste2 = " + liste2);


        // diziyi list e atmak istersek
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> liste4=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste4 = " + liste4);
        



    }
}
