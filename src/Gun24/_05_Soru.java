package Gun24;

import java.util.HashMap;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Canli sözlük yapilmak isteniyor
        // Kullaniciya asagidaki gibi bir menu cikariniz
        // 1 - Ekleme (Bu secenekte kelimenin kendisini ve manasini aliniz)
        // 2- Düzeltme (Bu secenekte kullanicinin kelimenin manasini duzeltiniz)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimenin manasini yazdiriniz)
        // 5- Silme
        // 6- Cikis

        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);

        HashMap<String, String > sozluk=new HashMap<>();
        int secim=0;
        do{
            // kullaniciya menuyu goster
            System.out.print("MENU\n1-EKLEME\n2-DÜZELTME\n3-LISTELEME" +
                    "\n4-ARAMA\n5-SILME\n6-CIKIS\nSECIMINIZ=");
            secim= okuInt.nextInt();
            // secimini al
            // secime göre islem yap

            switch (secim) {
                case 1: // ekleme islemleri ;
                    System.out.print("Kelime Giriniz=");
                    String kelime= okuStr.nextLine();
                    System.out.println("Anlami= ");
                    String anlami=okuStr.nextLine();
                    sozluk.put(kelime, anlami);
                    System.out.println("Ekleme Islemi Yapilmistir.");
                    break;
                case 2: // düzeltme islemleri;
                    break;
                case 3: // listeleme islemleri;
                    break;
                case 4: // arama islemleri;
                    System.out.println("Aranan Kelime Giriniz=");
                    kelime=okuStr.nextLine();
                    System.out.println(sozluk.get(kelime));
                    break;
                case 5: // silme islemleri
                    break;


            }

        }while(secim!=6);





    }
}
