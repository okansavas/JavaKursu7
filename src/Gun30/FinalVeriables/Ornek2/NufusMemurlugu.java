package Gun30.FinalVeriables.Ornek2;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("Ismet", "Cekmeköy");
        Vatandas v2=new Vatandas("Ayse", "Sisli");
        Vatandas v3=new Vatandas("Cilem", "Bakirköy");


        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        // v1.TCNO=45; final degiskenlere sadece
        // tanimlanirken veya Constructor da deger atanbilir.


    }
}
