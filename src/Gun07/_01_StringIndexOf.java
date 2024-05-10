package Gun07;

public class _01_StringIndexOf {
    public static void main(String[] args) {
        // IndexOf(harf/ler)  -> verilen harf/ler in Index ini ver
        // Bugün    IndexOf("B") -> 0 verir
        // oda numaralari, yani index hep aynidir, arama yönüne göre DEGISMEZ

        String cumle="Merhaba Dünya";
        // h nin oda numarasi kac  3
        // a nin oda numarasi kac  4
        // Dü nün indexi kac  8

        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf("M"));  // 0
        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf("h"));  // 3
        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf("a"));  // 4
        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf("Dü")); // 8
        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf(" "));  // 7
        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf("A"));  // -1  yok
        System.out.println("cumle.indexOf(M)) = " + cumle.indexOf("z"));  // -1

        System.out.println("cumle.indexOf(a,5)) = " + cumle.indexOf("a",5)); // 6
                       // 5 ten sonra aramaya basla

        System.out.println("cumle.indexOf(a,7) = " + cumle.indexOf("a" , 7)); // 12
                      // 7 den sonra aramaya basla












    }
}
