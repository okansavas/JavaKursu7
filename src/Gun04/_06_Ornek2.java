package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        String bagis1="500"; // string
        String bagis2="700"; // string

        System.out.println(bagis1 + bagis2);  //500700

        // ben bunlari sayi olarak toplamak istiyorum
        // o zaman String -> int cevirmek gerekir.

        int rakamBagis1= Integer.parseInt(bagis1);  // Double.parseDouble
        int rakamBagis2= Integer.parseInt(bagis2);  // parse: düzenleyip dönüstürmek demektir
        int toplamBagis=rakamBagis1+rakamBagis2;

        System.out.println(rakamBagis1+rakamBagis2);


    }
}
