package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // Math.random() : double sayi üretir. 0 - 0,99999999999 arasi üretiyor.
        // System.out.println(Math.random));

        // 0-10 arasi random tam sayi ariyorum

        int rndSayi= (int) (Math.random() * 10);
        System.out.println("rndSayi = " + rndSayi);



        //  0 - 0,999999999999999999999
        // 10 a kadar --> 9 max
        // 100 e kadar --> 99 max
        // 25 e kadar -> 24 max



    }
}
