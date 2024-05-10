package Gun06;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanicidan ogrenci misiniz seklinde sorunuz.
        // Evet ise True, degil ise False cevabini veriniz,
        // ve alinan cevabi yazdiriniz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Ögrenci misiniz? =");
        boolean cevap=oku.nextBoolean();  // True, true veya False, false

        System.out.println("cevap = " + cevap);







    }
}
