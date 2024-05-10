package Gun18;

public class _02_Soru {
    public static void main(String[] args) {
        // 10 elemanli bir diziyi random(10 dahil sayilarla) doldurduktan sonra,
        // dizide kac tek ve kac cift oldugunu bulunuz

        int[] dizi=new int[10]; // 10 elemanli bir dizi tanimladim

        for(int i=0; i < dizi.length; i++)
            dizi[i] = (int)(Math.random()*11);  // dizinin elemanlarini random doldurdum

        int tekMiktar=0, ciftMiktar=0;

        for (int i=0; i < dizi.length; i++) {

            if(dizi[i] % 2 ==0 )
                ciftMiktar++;
            else
                tekMiktar++;
        }

        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);






    }
}
