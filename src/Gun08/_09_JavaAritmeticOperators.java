package Gun08;

public class _09_JavaAritmeticOperators {
    public static void main(String[] args) {
        // Java da aritmetik islemler
        int a=9;
        int b=5;

        System.out.println("Toplama Islemi = " + (a+b) ); // 14
        System.out.println("Cikarma Islemi = " + (a-b));  // 4
        System.out.println("Carpma Islemi= " + (a*b));  // 45

        System.out.println("Bölme Islemi =" + (a/b));  // 1
        System.out.println("Bölme Islemi =" + (a/(double)b)); // 1.8
        // normal sonuc 1.8; fakat bilgisayar 2 si de tam sayi tipinde ise, küsürati atar
        // bu sebeple sonuc 1 olur, yuvarlama yapmaz, int/int = int olur
        // küsüratli sonuc istiyorsan, isleme girenlerden en az birisi double olmali

        int kalan = 9 % 5; // Modül % bu islem böler ve sadece kalani verir
        System.out.println("kalan = " + kalan);







    }
}
