package Gun42;

public class S71 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};

        System.out.println("arr.length = " + arr.length); // satir sayisi: 2
        System.out.println("arr[0].length = " + arr[0].length); // 1. (0.ind) satirin uzunlugu: 4
        System.out.println("arr[1].length = " + arr[1].length); // 2. (1.ind) satirin uzunlugu: 2

        for (int[] a : arr) {
            // a önce 1.satir sonra 2.satiri gönderir

            for (int i = 0; i < arr.length; i++) {
                System.out.println(a[i] + "");
            }
            System.out.println();


        }
    }
}
