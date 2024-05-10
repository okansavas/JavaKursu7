package Gun36._02_Abstract;

import Gun35._06_Interface.Kare;

public class GeoMain {
    public static void main(String[] args) {
       // Sekil s = new Sekil("sekil1")
        // abstract class dan new OLMAZ

        Dikdortgen d=new Dikdortgen("Dikdörtgen", 4, 5);
        System.out.println(d);
        d.ciz();

        Daire dr=new Daire("Daire", 4);
        System.out.println(dr);
        dr.ciz();

        Sekil d2=new Dikdortgen("d", 6, 7);
        // Referans tipi olarak kullanilabilir


    }
}
