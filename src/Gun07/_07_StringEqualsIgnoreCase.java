package Gun07;

public class _07_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // EqualsIgnoreCase
        // equals ayni calisir sadece büyük kucuk harf ayrimi yapmaz

        String s1="merhaba";
        String s2="MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2));  //false
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));  //true





    }
}
