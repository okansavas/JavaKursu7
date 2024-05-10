package Gun31._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    Scanner oku = new Scanner(System.in);

    ArrayList<Pizza> siparisler = new ArrayList<>();

    int secim = 0;
    do{
        menu();
        secim = oku.nextInt();
        switch (secim) {
            case 1: Pizza sp=new Pizza(Pizzasize.SMALL);
                    siparisler.add(sp);
                    break;
            case 2: Pizza mp=new Pizza(Pizzasize.MEDIUM);
                    siparisler.add(mp);
                    break;
            case 3: Pizza lp=new Pizza(Pizzasize.LARGE);
                    siparisler.add(lp);
                    break;
            case 4: siparisYazdir(siparisler);
                break;



        }


    } while(secim <=4);  //oldugu surece dön

    public static void siparisYazdir(ArrayList<Pizza> siparisler) {
        int s=0, m=0, l=0;
        for(Pizza p : siparisler) {
             if (p.size == Pizzasize.SMALL) s++;
             else if(p.size==Pizzasize.MEDIUM) m++;
             else if(p.size==Pizzasize.LARGE) l++;

            System.out.println("Siparisleriniz");
            System.out.println("small pizza dan = " +s+"adet");
            System.out.println(" medium pizza dan " +m+"adet");
            System.out.println(" large pizza dan " +l+"adet");


        }


    }


    public static void menu() {
        System.out.println("******* Pizza Menu ********");
        System.out.println("1 - Small");
        System.out.println("2 - Medium ");
        System.out.println("3 - Large");
        System.out.println("4 - Isleme Al-Siparis Gönder");
        System.out.println("5 - Cikis");
        System.out.println("Seciminiz");

    }
}