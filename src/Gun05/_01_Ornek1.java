package Gun05;

public class _01_Ornek1 {
    public static void main(String[] args) {
        String ad="Ismet Temur";
        int sinifNo=5;
        char subesi='A';
        boolean gectiMi=true;

        System.out.println(ad+ " "+sinifNo+" "+subesi+" "+gectiMi);


        // birlestirmeye soldan saga dogru giderim.
        // solda string varsa yanindaki otomatik string e dönüstürürüm. Eklerim

        System.out.println("merhaba"+1+2); // merhaba12
        System.out.println(1+2+"merhaba"); // 3merhaba
        // soldan geldiginde önce 1+2 3 olarak TOPLAMA islemi yapti, sonrasinda
        // merhaba stringine gelince ona EKLENDI

        // sayilari Stringe nasil ceviririz ?
        int sayi=56;
        String strSayi= String.valueOf(sayi);  // sayiyi string cevirmis oldum




    }
}
