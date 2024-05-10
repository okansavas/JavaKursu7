package Gun10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // Girilen bir cümlede a harfinin gecip gecmedigini
        // bulunuz geciyor ise EVET, gecmiyor ise HAYIR yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.println("Cumle Giriniz =");
        String cumle=oku.nextLine();

        // 1.yöntem
        boolean varMi= cumle.contains("a");

        if (varMi ==true)
            System.out.println("EVET");

        if (varMi==false)
            System.out.println("HAYIR");

        // 2.yöntem
        if (cumle.contains("a") == true)
            System.out.println("EVET");

        if (cumle.contains("a") == false)
            System.out.println("HAYIR");

        // 3.yöntem
        boolean varMi2= cumle.contains("a");

        if (varMi2)  // varMi=true  varMi
            System.out.println("EVET");

        if (!varMi2)
            System.out.println("HAYIR");

        // 4.yöntem

        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a"))
            System.out.println("HAYIR");











    }
}
