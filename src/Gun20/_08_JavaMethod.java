package Gun20;

public class _08_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");


        merhabaYaz();  // veri almiyor, veri döndürmüyor
        toplamYaz(4,5); // veri aliyor, veri döndürmüyor
        enbuyukYaz(4,5); // veri aliyor, veri döndürmüyor

        int enb=Math.max(4,5);  // veri aliyor, veri döndürüyor

        int enb2=enBuyukVer(4,5); // veri alsin, veri döndürsün
        System.out.println(enb2);
    }

    public static int enBuyukVer (int s1, int s2) {
        int enBuyuk=0;

        if(s1>s2)
            enBuyuk=s1;

        else
            enBuyuk=s2;
        return enBuyuk;
    }

    public static void merhabaYaz() // return yok, veri döndürmüyor
    {
        System.out.println("Merhaba Dünya");
    }

    public static void toplamYaz(int s1, int s2) {
        System.out.println("Toplam=" + (s1+s2));

    }

    public static void enbuyukYaz(int s1, int s2) {
        if (s1>s2)
            System.out.println(s1+"büyük");
        else
            System.out.println(s2+"büyük");


    }
}
