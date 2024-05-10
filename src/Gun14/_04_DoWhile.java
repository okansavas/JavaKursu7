package Gun14;

import java.util.Scanner;

public class _04_DoWhile {
    public static void main(String[] args) {
        // Kullanicidan x girilene kadar ekrana "Program Calisiyor" yazan
        // ve x girildiginde ise "Program Bitti" yazan programi yaziniz.


        // döngünün icerisinde neler olacak
        // okuma islemi var, eger x den farkli ise yazma islemi var
        // sart girilen x den farkli oldugu surece dönecek

        Scanner oku= new Scanner(System.in);
        String girilen;

        do {
            System.out.print("Ifade giriniz=");
            girilen=oku.next();

            if (!girilen.equalsIgnoreCase("x"))
                System.out.println("Program Calisiyor");

        } while(!girilen.equalsIgnoreCase("x"));

        System.out.println("Program Bitti");




    }
}
