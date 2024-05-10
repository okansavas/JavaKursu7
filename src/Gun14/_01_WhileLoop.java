package Gun14;

import java.util.Scanner;

public class _01_WhileLoop {
    public static void main(String[] args) {
        // 1 den 100 e kadar olan sayilarin toplamini bulunuz

        Scanner oku = new Scanner(System.in);
        int toplam = 0, sayac = 1;

        while (sayac < 100) {
            toplam = toplam + sayac;
            sayac++;


        }
        System.out.println("toplam = " + toplam);
    }
}
