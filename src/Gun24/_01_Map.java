package Gun24;

import java.util.HashMap;

public class _01_Map {
    public static void main(String[] args) {

        // Set -> Hashset, LinkedHashSet, TreeSet
        // Map -> Hashmap, LinkedHashMap, TreeMap

        // Map = Anahtar + Set = Anahtarli Set

        // anahtar ve value nin tipini biz verecegiz

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(2001, "Esma");
        hm.put(2, "Oguzhan");
        hm.put(1003, "Kaan");
        hm.put(1001, "Ahmet Kaya"); // son gelen veri kabul edilir

        System.out.println("hm = " + hm);


        System.out.println("hm.get(2001) = " + hm.get(2001));  // Esma yi verir
        System.out.println("hm.get(1003) = " + hm.get(1003) ); // Kaan i verir

        System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));  // 1003 var mi yok mu
        System.out.println("hm.containsValue(Kaan) = " + hm.containsValue("Kaan"));  // Kaan degerler de var mi

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(1001);  // 1001 i kaldir
        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size()); //

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
