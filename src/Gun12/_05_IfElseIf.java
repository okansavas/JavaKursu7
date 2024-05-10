package Gun12;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _05_IfElseIf {
    public static void main(String[] args) {
        // Soru: Kullanicidan Fizik:90 seklinde not bilgisini aliniz.
        // >= 90 icin A
        // >=80 icin B
        // >=70 icin C
        // >=60 icin D
        // >=50 icin E
        // >=40 icin F yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.println("Dersi ve notunu giriniz=");
        String dersVeNotu = oku.nextLine();  // Fizik:90

        // 1.Yöntem
        int ind=dersVeNotu.indexOf(":"); // verilenin index ini verir
        String strNot=dersVeNotu.substring(ind+1);
        int ogrNot= Integer.parseInt(strNot);

        // 2.Yöntem
        String strNot2= dersVeNotu.replaceAll("[^0-9],","");  // 90

        // ladder if : merdivenli if

        if (ogrNot >= 90)
            System.out.println("A");
        else
            if (ogrNot >= 80)
                System.out.println("B");
            else
                if (ogrNot >= 70)
                    System.out.println("C");
                else
                    if (ogrNot>=60)
                        System.out.println("D");
                    else
                        if (ogrNot>=40)
                            System.out.println("E");
                        else
                            System.out.println("F");







    }
}
