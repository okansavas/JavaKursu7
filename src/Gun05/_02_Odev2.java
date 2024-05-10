package Gun05;

import java.util.Scanner;

public class _02_Odev2 {
    public static void main(String[] args) {
        // Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.

        Scanner oku=new Scanner(System.in);

        System.out.print("Isminizi Giriniz:");
        String isim=oku.nextLine();

        System.out.println(isim);

        // Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.

        System.out.print("Bir sayi giriniz:");
        int sayi= oku.nextInt();

        System.out.println(sayi);

        // Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.

        System.out.print("Sevdiginiz bir meyveyi yaziniz:");
        String meyve=oku.next();

        System.out.println(meyve);

        // Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.

        System.out.print("kapi sayisini giriniz:");
        int kapiNo=oku.nextInt();

        System.out.println(kapiNo);

        //  Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.

        System.out.print("10 sene önceki yasadiginiz sehri yaziniz:");
        String sehir=oku.next();

        System.out.println(sehir);

        // Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.

        System.out.print("Dogum gününüzü giriniz:");
        String dogumGunu=oku.nextLine();

        System.out.println(dogumGunu);

        // Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.

        System.out.print("Bir banka hesabiniz var mi?");
        boolean hesap=oku.nextBoolean();

        System.out.println(hesap);

        // bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.

        System.out.print("bir agirlik giriniz:");
        byte agirlik= oku.nextByte();

        System.out.println(agirlik + "kg");

        // Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.

        System.out.print("Boyunuzu giriniz:");
        float boy= oku.nextFloat();

        System.out.println(boy);

        // Kullanıcıdan alacağının 2 sayının 4 işlemini ekrana yazdırınız.

        System.out.println("2 adet sayi giriniz");
        int sayi1= oku.nextInt();
        int sayi2= oku.nextInt();

        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 * sayi2);
        System.out.println(sayi1 / sayi2);

        // Kullanıcdan alacağınız 3 öğrenci ders notunun ortalamasını ekrana yazdırınız.

        System.out.println("3 ögrencinin notlarini yaziniz:");
        int ogrenci1= oku.nextInt();
        int ogrenci2= oku.nextInt();
        int ogrenci3= oku.nextInt();

        int ort= ((ogrenci1+ogrenci2+ogrenci3) / 3 );
        System.out.println(ort);



    }
}
