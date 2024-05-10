package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz 6 elemanli(sayi) bir dizinin
        // sadece tek sayi olan elemanlarini ayri diziye(liste)(ArrayList) atayarak
        // yazdiriniz.


        Scanner oku= new Scanner(System.in);
        int[] dizi=new int[6];

        for(int i=0; i < dizi.length; i++) {
            System.out.println("Sayi=");
            dizi[i]=oku.nextInt();


        }

        System.out.println("dizi=" + Arrays.toString(dizi));

        ArrayList<Integer> tekler= new ArrayList<>();

        for(int i=0; i < dizi.length; i++) {

            if (dizi[i] % 2 == 1)
                tekler.add(dizi[i]);

        }

        // 1.yol fotograf
        System.out.println("tekler = " + tekler);

        // 2.yol tek tek alimlari
        for(int i=0; i < tekler.size(); i++)
            System.out.println(tekler.get(i)+"\t");


    }
}
