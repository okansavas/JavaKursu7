package Gun14;

import java.util.Scanner;

public class _03_DoWhile {
    public static void main(String[] args) {
        // Kullanici 0 degeri girene kadar sayi isteyiniz ve sayilari
        // toplayiniz, 0 girdiginde toplami yaziniz

        // döngünün icindekiler neler?
        // sayi oku, toplam=toplam+sayi
        // döngünün sarti sayi!=0

        Scanner oku=new Scanner(System.in);
        int toplam=0, sayi;

        System.out.print("Sayi giriniz");
        sayi=oku.nextInt();
        toplam=toplam+sayi;

        while (sayi!=0) {  // sarti kontrol et, sonra dön


            System.out.print("Sayi Giriniz");
            sayi=oku.nextInt();
            toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);
        toplam=0;

        // kardesi Do While
        // sarti kontrol etmeden 1 kere calis, sonra kontrol ederek calis

        do { // bu döngü sarta bagli olmaksizin bir kere calisir
            System.out.print("Sayi giriniz=");
            sayi=oku.nextInt();
            toplam=toplam+sayi;

        } while (sayi!=0);

        System.out.println("toplam = " + toplam);

        // While : önce kontrol sonra döngü
        // do_while: önce bir kez calis, sonra kontrol, sonra döngü




    }
}
