package Gun23;

import java.util.ArrayList;

public class _01_Sets {
    public static void main(String[] args) {
        int sayi=5;

        int [] dizi= new int[10]; // 10
        int[][] tablo= new int[2][5]; // 20

        ArrayList<Integer> liste=new ArrayList<>();  //1D
        ArrayList< ArrayList<Integer> > listeler=new ArrayList<>(); // 2D

        /***************************************************/

        // Java cim senden su ana kadar lazim durumda uygun degiskenleri aldim, tesekkur ederim
        // fakar bana söyle dizi lazim, icine verileri attigimda tekrar eden veri gelirse EKLEMESIN
        // 2.cisi, bu dizi
        // a) istersem, ne eklersem ekleyim, her zaman icindekileri sirali tutsun
        // b) istersem, eklenme sirasina göre tutsun
        // c) istersem en hizli calismak icin, kendisi istedigi sirada tutsun

        // tek tek eleman eleman islemler icin degil de, islem yapilacagi zaman, bütün elemanla isleme
        // alinmasina uygun olan bu toplu islem dizisine SET denir
        // a) TreeSet -> her zaman sirali
        // b) LinkedHashSet -> eklenme sirasina göre
        // c) HashSet -> hizli calissin sirasi önemli degil

        // BUNLARDA INDEX yok



    }
}
