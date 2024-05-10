package Gun19;

import java.util.Arrays;

public class _04_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = new int[2][3];

        int[][] tablo2 = // farkli satir boyutlari ancak bu tanimlama sekli ile olusturulabilir
                {

                        {2,8},
                        {22,33,44,5,6,7,8},
                        {3,4,5,6,6,7}


                };

        //tablo2[0]=new int[9];  // herhangi bir satiri yeniden istediginiz boyutla verebilirsiniz
        for(int i=0; i < tablo2.length; i++) {

            for (int j=0; j < tablo2[i].length; j++)
                System.out.println(tablo2[i][j]+"\t");

            System.out.println();

        }
        System.out.println("1.Satir=" + Arrays.toString(tablo2[0]));
        System.out.println("2.Satir=" + Arrays.toString (tablo2[1]));
        System.out.println("3.Satir=" + Arrays.toString(tablo2[2]));

    }
}
