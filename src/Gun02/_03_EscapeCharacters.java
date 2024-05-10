package Gun02;

public class _03_EscapeCharacters
{
    public static void main(String[] args) {
        /* Escape Characters
         \n -> yeni satir ac, alt satira gec
         \t -> tab tusuna basilmis gibi yapar, 2,3 karakterlik bosluk olusturur.
         \b -> backspace tusuna basma etkisi, yani 1 karakter geri siler
         \" -> cift tirnak yazmak icin kullanilir
         \\ -> slac yani \ yazdirmak icin kullanilir
         \r -> bulundugun satirin basina git

        */

        System.out.println("MerhabaDünya");  // MerhabaDünya
        System.out.println("Merhaba\nDünya"); // Merhaba alt satira gec Dünya
        System.out.println("Merhaba\tDünya"); // Merhaba  Dünya
        System.out.println("Merhaba\bDünya"); // Merhabdünya
        System.out.println("Merhaba\"Dünya"); // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); // Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); // Dünya
    }

}
