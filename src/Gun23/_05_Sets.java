package Gun23;

import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(5); // silinen eleman
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(4);

        System.out.println("hs.size() = " + hs.size());

        hs.remove(5);  // elemanin degerine göre siler, index yok
        System.out.println("hs = " + hs);

        if(hs.contains(7))
            System.out.println("VAR");
        else
            System.out.println("YOK");

        hs.clear();
        System.out.println("hs = " + hs);




    }
}
