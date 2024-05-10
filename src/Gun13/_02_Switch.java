package Gun13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {
        // Kullanicinin girdigi gün numarasina karsilik gelen günün adini yaziniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Gün no=");
        int gunNo=oku.nextInt();

        // If (gunNo==1)
        // System.out.println("Pazartesi");
        // else
        //   If (gunNo==2)
        //       System.out.println("Sali");


        switch (gunNo) {
            case 1: System.out.println("Pazartesi"); break;
            case 2: System.out.println("Sali"); break;
            case 3: System.out.println("Carsamba"); break;
            case 4: System.out.println("Persembe"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("Cumartesi"); break;
            case 7: System.out.println("Pazar"); break;
            default: System.out.println("Hatali giris yaptiniz"); break;


        }





    }
}
