package Gun07;

public class _02_StringLastIndexOf {
    public static void main(String[] args) {
        // indexOf: Bastan aramaya baslar, oda numarasini verir
        // LastIndexOf: sondan aramaya baslar, yine oda numarasini verir


        //            0123456789012
        String cumle="Merhaba Dünya";

        System.out.println("cumle = " + cumle);

        System.out.println("indexOf( ) = " + cumle.indexOf("a"));  // 4
        System.out.println("lastIndexOf(a) = " + cumle.lastIndexOf("a"));  //12


    }
}
