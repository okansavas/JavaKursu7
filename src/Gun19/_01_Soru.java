package Gun19;

public class _01_Soru {
    public static void main(String[] args) {
        // 2 ye 5 lik bir tabloyu random 100 e kadar sayilarla doldurunuz
        // bütün doldurma islemi bittikten sonra
        // kac tane tek sayi oldugunu bulunuz.

        int[][] tablo = new int[2][5];

        for (int satir = 0; satir < tablo.length; satir++)
                for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                tablo[satir][sutun] = (int) (Math.random() * 100); // 10 kez calisti


        int tekMiktar = 0;
        for (int satir = 0; satir < tablo.length; satir++) {
            for(int sutun=0; sutun < tablo[satir].length; sutun++)
            if (tablo[satir][sutun] % 2 == 1)
                tekMiktar++;
        }
        System.out.println("tekMiktar = " + tekMiktar);

    }
}

