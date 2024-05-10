package Gun08;

public class _06_StringReplace {
    public static void main(String[] args) {
        // replace : bir stringin icindeki karakter/ler verilenle degistirir

        String text = "Merhaba Dünya";
        System.out.println("text = " + text);

        System.out.println("text.replace(\"a\", \"e\") = " + text.replace("a", "e")); //Merhebe Dünya
        System.out.println("text = " + text.replace("ba", "de")); //Merhade Dünya
        System.out.println("text = " + text.replace("a", "aaa")); // Merhaaabaaa Dünyaaa
        System.out.println("text = " + text.replace("a","")); // Merhb Düny
        System.out.println("text = " + text.replace("a","***")); //Merh***b*** Düny***



    }
}
