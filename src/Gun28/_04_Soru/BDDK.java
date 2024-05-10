package Gun28._04_Soru;

public class BDDK {
    public static void main(String[] args) {
        banka b1=new banka();
        b1.adi="Ziraat Bankasi";
        b1.kurulusYili=1876;
        b1.subeSayisi=1500;

        banka b2=new banka("Garanti");
        banka b3=new banka("Akbank",1980,600);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);





    }

}
