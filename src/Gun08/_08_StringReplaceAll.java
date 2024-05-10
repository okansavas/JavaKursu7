package Gun08;

public class _08_StringReplaceAll {
    public static void main(String[] args) {
        // RePlaceAll: replace gibi calisir. farki Kriter(regex) verilebiliyor
        // regex : regular expression / duzenli ifadeler
        // TODO (yapilacak): regex olarak neler yazilabiliyor google dan arastirilacak

        String text="Merhaba12 Dünya23";

        System.out.println("text = " + text.replaceAll("[abn]", "_")); // abn yi degistirir
        System.out.println("abn -> = " + text.replaceAll("[123]", "de")); // 123 ü bosalt
        System.out.println("0-9 -> = " + text.replaceAll("[0-9]", "")); // 0-9 arasindakileri sil
        System.out.println("a-z -> = " + text.replaceAll("[a-z]", "")); // a-z arasindakileri sil
        System.out.println("0-9 -> " + text.replaceAll ("[^0-9]", "")); // 0-9 DISINDAKILERI sil
        System.out.println("0-9 -> " + text.replaceAll("[A-Z]", "")); // A-Z arasindakileri sil

        System.out.println(text.replaceAll("[A-Z]","").replaceAll("[a-z]", ""));
        // tüm harfleri siler



    }
}
