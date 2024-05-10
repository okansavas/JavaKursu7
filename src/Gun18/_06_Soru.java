package Gun18;

public class _06_Soru {
    public static void main(String[] args) {
        // 2 veya 3 lük bir tabloyu random 100 e kadar sayilarla doldurunuz
        // bütün doldurma islemi bittikten sonra
        // sonrasinda yazdiriniz

        int[][] tablo=new int[2][3];  // 2 ye 3 lük bir tablo

        // tabloyu random 100 e kadar sayilarla doldurunuz
        for(int i =0; i < 2; i++) {
            for(int j=0; j < 3; j++)
                tablo[i][j]=(int)(Math.random()*100);
        }

        for(int i =0; i < tablo.length; i++) {  // 2 yerine tablo.length daha dogru
            for (int j = 0; j < tablo[i].length; j++)  // 3 yerine tablo[i].length daha dogru
                System.out.print(tablo[i][j]+"\t");

            System.out.println();
        }


    }
}
