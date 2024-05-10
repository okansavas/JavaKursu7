package Gun17;

import java.util.Scanner;

public class _04_JavaSplitMetodu {
    public static void main(String[] args) {
        // Kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku = new Scanner(System.in);
        System.out.println("cumle=");
        String cumle = oku.nextLine();

        // 1.yöntem

        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ')
                boslukSayisi++;  // burada bosluk sayisini buluyorum

        }

        System.out.println("kelimeSayisi = " + (boslukSayisi+1));

        // 2.Yöntem

        String[] kelimeler = cumle.split(" "); // bosluga göre böl ve elemanlari dizi olarak ver
        System.out.println("kelimeler = " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);


        }
        // 3.Yöntem
        System.out.println("kelimeler = " + cumle.split(" ").length);

    }
}