package Gun16;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        for (int j = 1; j <= 5; j++) {

            // yukaridaki döngü bu döngüyü 5 kez calistirir
            for (int i = 1; i <=j; i++) { //satir numarasina kadar o da j
                System.out.print("*");

                System.out.println();

            }
        }

    }
}
