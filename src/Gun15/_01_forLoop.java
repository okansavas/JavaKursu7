package Gun15;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class _01_forLoop {
    public static void main(String[] args) {
        // kullanicinin girecegi bir rakama (dahil) kadar
        // olan sayilarin toplamini bulunuz.

        Scanner oku=new Scanner(System.in);
        int sinir=oku.nextInt();

        int toplam=0;
        // genelde sayac yerine i veya j kullanilir
        for (int i=1; i<=sinir; i++ ) {
            
            toplam=toplam+i;
        }

        System.out.println("toplam = " + toplam);




    }
}
