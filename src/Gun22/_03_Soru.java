package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Bir canli sözlük yapilmak isteniyor
        // Kullanicidan kelime ve manasi seklinde
        // Devam etmek istedigi kadar bilgi aliniz
        // 2 bilgi aliniz
        // Daha sonra kullanicidan bir kelime alarak
        // manasini yazdiriniz

        // kelimeler bir yerde, anlamlari bir yerde olacak
        ArrayList<String> kelimeler=new ArrayList<>();
        ArrayList<String> manalari=new ArrayList<>();

        ArrayList<ArrayList<String> > sozluk=new ArrayList<>();
        sozluk.add(kelimeler);
        sozluk.add(manalari);


        Scanner okuStr= new Scanner(System.in);

        String cevap="";

        do {
            System.out.print("Kelime Giriniz=");
            String kelime= okuStr.nextLine();
            kelimeler.add(kelime); // sozluk.get(0).add(kelime);

            System.out.print("Manasini Giriniz=");
            String mana= okuStr.nextLine();
            manalari.add(mana); // sozluk.get(1).add(mana);


            System.out.println("Devam Etmek Istiyor musunuz?(E/H)");
            // Cevabi al döngü sarti olarak kullan
            cevap=okuStr.next();




        }while(cevap.equalsIgnoreCase("E"));  // evet oldugu sürece dön

        System.out.println("Aranacak kelime giriniz=");
        String arananKelime=okuStr.nextLine();

         // simdi aranan kelimeyi bulalim

        for(int i=0; i < kelimeler.size(); i++) {  // sozluk.get(0).size()
            if (kelimeler.get(i).equalsIgnoreCase(arananKelime)) // kelime bulundu
            {
                System.out.println(manalari.get(i));
            }



        }






    }
}
