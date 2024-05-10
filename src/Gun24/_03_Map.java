package Gun24;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class _03_Map {
    public static void main(String[] args) {
        // Hashmap: hizli calismak icin kendi algoritmasina göre sirada saklar
        // LinkedHashMap: eklendigi siraya göre icindeki elemanlari saklar
        // TreeMap: icindeki elemanlari her zaman KEY e göre sirali saklar

        HashMap<Integer, String> hm=new HashMap<>();  // Map lerden Hashmap
        hm.put (9, "tilki");
        hm.put(2, "kedi");
        hm.put(30, "köpek");
        hm.put(11, "kus");
        hm.put(4, "kurt");

        System.out.println("hm = " + hm);

        LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put (9, "tilki");
        lhm.put(2, "kedi");
        lhm.put(30, "köpek");
        lhm.put(11, "kus");
        lhm.put(4, "kurt");

        System.out.println("lhm = " + lhm);


        LinkedHashMap<Integer, String> tm=new LinkedHashMap<>();
        tm.put (9, "tilki");
        tm.put(2, "kedi");
        tm.put(30, "köpek");
        tm.put(11, "kus");
        tm.put(4, "kurt");

        System.out.println("tm = " + tm);



    }
}
