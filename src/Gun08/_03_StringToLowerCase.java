package Gun08;

public class _03_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi kucuk harfe cevirir

        String text="Merhaba Dünya";

        System.out.println("text = " + text);  // Merhaba dünya
        System.out.println("text = " + text.toLowerCase()); // merhaba dünya

        System.out.println("text.startsWith(m) = " + text.startsWith("m"));  // false
        System.out.println("text = " + text.toLowerCase().startsWith("m"));  // true




    }
}
