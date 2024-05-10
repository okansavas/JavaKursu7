package Gun23;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {
        // SETS: TEKRAR YOK (hepsinde)
        // HashSet: HIZLI, bunun icin icindekileri kendi mantigina siralar
        // LinkedHashSet: EKLENME SIRASI na göre sirali tutar
        // TreeSet: HER ZAMAN SIRALI, kendinden sortlu


        // Hizli, bunun icin kendine göre algoritmayla sirali tutuyor
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dört");
        hs.add("bes");
        System.out.println("hs = " + hs);

        // Ekleme SIRASINA göre sirali Tutar

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");

        System.out.println("lhs = " + lhs);


        // Kendinden Sort lu
        TreeSet<String> ts = new TreeSet<>();

        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");

        System.out.println("ts = " + ts);




    }
}
