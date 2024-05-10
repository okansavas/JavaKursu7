package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayListSoru {
    public static void main(String[] args) {
        // Bir ögretmenden girmek istedigi kadar notu aliniz
        // Ögretmene devam etmek istiyor musunuz (E/H) seklinde sorunuz
        // ve ortalamayi gecen ögrenci sayisini bulunuz

        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);

        ArrayList<Integer> notlar= new ArrayList<>();

        int toplam=0;
        String cevap="";

        do {
            // notu oku
            System.out.print("Not");
            int not= okuInt.nextInt();
                    
            // ArrayList e ekle
            notlar.add(not);
            toplam=toplam+not;

            System.out.println("Devam Etmek Istiyor musunuz?(E/H)");
            // Cevabi al döngü sarti olarak kullan
            cevap=okuStr.next();


        }while(cevap.equalsIgnoreCase("E"));  // evet oldugu sürece dön

        System.out.println("notlar = " + notlar);

        int ort= toplam / notlar.size();

        int gecenSayisi=0;

        for( int i=0; i < notlar.size(); i++) {

            if(notlar.get(i) >= ort)
                gecenSayisi++;
        }
        System.out.println("gecenSayisi = " + gecenSayisi);


    }
}
