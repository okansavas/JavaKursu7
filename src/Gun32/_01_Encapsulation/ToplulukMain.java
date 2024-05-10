package Gun32._01_Encapsulation;

public class ToplulukMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        kisi1.ad="Ismet";
        kisi1.soyad="Temur";
        //kisi1.yas=-40;

        kisi1.setYas(40);
        System.out.println(kisi1.getYas());

        // degiskene direkt erisimi kapatip
        // bir metod ile korumali veri gönderme
        // ve alma islemine Encapsulation denir






    }
}
