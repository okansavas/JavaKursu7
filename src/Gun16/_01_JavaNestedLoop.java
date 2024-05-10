package Gun16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // Asagidaki görünümü tek yildiz kullanarak yazdiriniz.
        // *****
        // *****
        // *****
        // *****
        // *****


        for (int j = 1; j <= 5; j++) {

            // yukaridaki döngü bu döngüyü 5 kez calistirir
            for (int i = 1; i <= 5; i++) { //25 kez calisir
                System.out.print( "*");

                System.out.println();

            }


        }
    }
}