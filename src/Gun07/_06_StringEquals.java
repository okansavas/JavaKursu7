package Gun07;

public class _06_StringEquals {
    public static void main(String[] args) {
        // Equals: bir stringi digeriyle esit mi diye sorar
        // sonuc boolean

        String s1="merhaba";
        String s2="MERHABA";

        boolean esitMi= s1.equals(s2);  // s1 s2 ye esit mi
        System.out.println("esitMi = " + esitMi);  // false

        System.out.println("esitMi= "+ s1.equals(s2)); //  2.yöntem  false
        System.out.println("esitMi= "+ s1.equals("merhaba")); //true




    }
}
