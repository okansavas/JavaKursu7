package Gun16;

public class _05_JavaDizi {
    public static void main(String[] args) {
         int sayi; // 1 tane sayi saklamak icin

        int ogrNot=0;

        int ogrNot1;
        int ogrNot2;
        //..
        //..
        int ogrNot50=50;

        // 1 tanimlamada yani 1 kalemde coklu veri tutabilecek
        // degiskenler lazim
        int [] notlar= new int [50]; // icinde 50 tane sayi saklayabilen degisken

        notlar[0]=50;
        notlar[1]=70;
        //..
        //..
        notlar[49]=89;

        System.out.println("notlar[0], 1. Ögrenci Notu=" + notlar[0]);
        System.out.println("50. yani, son ögrencinin notu =" + notlar[49]);
        System.out.println("kac not var ? = " + notlar.length);





    }
}
