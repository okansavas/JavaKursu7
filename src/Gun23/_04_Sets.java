package Gun23;

import java.util.Iterator;
import java.util.TreeSet;

public class _04_Sets {
    public static void main(String[] args) {
        TreeSet<String> renkler=new TreeSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // Ekrana yazdirma (fotograf)
        System.out.println("renkler = " + renkler);

        // Ekrana tek tek nasil yazdiririm
        for(String eleman: renkler)  // sira garanti degil
            System.out.println("eleman = " + eleman);

        int[] dizi={34,5,6,7,8,89,899,77};
        for(int eleman : dizi)
            System.out.println("eleman = " + eleman);

        // SETLERI hafizadaki sirasi garanti olarak  nasil alirdim ?


        Iterator gosterge=renkler.iterator(); // renklerin basina konumlandi
        while (gosterge.hasNext()) // sirada eleman var ise
        {

            System.out.println("renkler = " + gosterge.next());
            // siradaki eleman
            // .Next gostergenin gosterdigi elemani temsil ediyor

        }



    }
}
