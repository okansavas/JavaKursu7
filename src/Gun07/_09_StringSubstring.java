package Gun07;

public class _09_StringSubstring {
    public static void main(String[] args) {
        // Substring : string den parca alir

        String s1="Merhaba Java yi sevenler dernegi üyeleri";

        String parca1= s1.substring(3,9); // 3 den basla 9 a kadar al
        // 3 parametrede index, 3 den 9 a kadar al, 9 dahil degil

        System.out.println("parca1 = " + parca1);  // haba J

        System.out.println("s1.substring(8,15) = " + s1.substring(8,15));
        // Java yi

        System.out.println("s1.substring(8) = " + s1.substring(8));
        // verilenden SONA kadar parcayi alir









    }
}
