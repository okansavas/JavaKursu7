package Gun17;

public class _02_JavaArray {
    public static void main(String[] args) {
        int[] dizi=new int[5]; // 0,1,2,3,4 index li eleman haneleri olan int dizi
        int[] dizi2={3,6,56,78,98,67,89}; // 7 elemanli dizi
        int dizi3[]={3,6,56,78,98,67,89}; // 7 elemanli dizi

        String[] kelimeler=new String[5]; // 5 elemanli String dizisi
        boolean[] dizi4=new boolean[5]; // 5 elemanli boolean dizisi
        double[] oranlar=new double[5]; // 5 elemanli double dizisi

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("int dizi = " + dizi[i]);
            
        }

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("string dizi = " + kelimeler[i]);
            
        }

        for (int i = 0; i < dizi4.length; i++) {
            System.out.println("boolean dizi = " + dizi4[i]);
            
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("double dizi = " + oranlar[i]);
            
        }



    }
}
