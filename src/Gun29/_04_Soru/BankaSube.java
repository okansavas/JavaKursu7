package Gun29._04_Soru;

public class BankaSube {
    public static void main(String[] args) {
        Musteri m=new Musteri();
        m.musteriNo=10011;
        m.ad="Ismet";
        m.soyad="Temur";

        //m.musteriHesap.yatan=100;
        //m.musteriHesap.bakiye=100000000;

        m.musteriHesap.paraYatir(100);
        m.musteriHesap.paraYatir(200);
        m.musteriHesap.paraCek(50);

        System.out.println(m.musteriHesap);
        System.out.println(m);


      



    }
}
