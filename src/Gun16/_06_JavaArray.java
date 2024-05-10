package Gun16;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _06_JavaArray {
    public static void main(String[] args) {
        // dizi nasil okunur ve nasil yazdirilir?

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[10];

        for (int i=0; i <10; i++) {
            System.out.print("dizinin "+i+".elemani");
            dizi[i] = oku.nextInt();
        }
        for (int i=0; i<10; i++)
            System.out.println("dizi["+i+"]="+dizi[i]);

        // for döngüsünde duracak nokta olarak sabit son rakamı
        // vermek yerine, dizi.length şeklinde kullanılırsa,
        // daha sonradan dizi boyutu değiştirildiğinde ,
        // for ların son duracağı noktaları değiştirmek
        // zorunda kalmayız



    }
}
