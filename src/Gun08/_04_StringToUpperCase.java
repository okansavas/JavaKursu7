package Gun08;

public class _04_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : stringin büyük harf halini verir

        String text="merhaba dünya";

        System.out.println("text = " + text); // merhaba dünya
        System.out.println("text = " + text.toUpperCase()); // MERHABA DÜNYA

        System.out.println("text.startsWith(m) = " + text.startsWith("M"));  //false
        System.out.println("text.toUpperCase().startsWith(M) = " + text.toUpperCase().startsWith("M")); // true


    }
}
