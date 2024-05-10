package Gun21;

import java.util.ArrayList;

public class _04_ArrayList {
    public static void main(String[] args) {
        int sayi=5; // 1 tane sayi tutabilen hafiza bölgesi
        int [] dizi= new int[5];  // 5 tane sayi tutabilen ve ismi dizi olan hafiza bölgesi (apartman)
        // 5 tane 5 kaliyor, 3 tane kullansan 2 tanesi atil kaliyor, uzunluk hep sabit
        // ARRAY

        // dizinin yerine söyle bir sey olsa, uzunlugu basta hic olmasa, ben ekledikce artsa
        // sildikce azalsa, yani alisveris listesi gibi, boyutu esnek olsun
        // dizinin kuzeni: ARRAY in LIST hali

        ArrayList<Integer> list=new ArrayList<>();  // ekledikce uzayacak, sildikce kisalacak
        ArrayList<String> stringlist= new ArrayList<>();
        ArrayList<Double> doubleList= new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler); // direk fotograf

        isimler.add("Burak");
        isimler.add("Asli");
        isimler.add("Selda");
        isimler.add("Serkan");

        System.out.println("isimler = " + isimler);
        System.out.println("isim.size = " + isimler.size());

        isimler.add(1,"Mertcan");  // insert: araya ekleme, digerleri bir üste koyar
        System.out.println("isimler = " + isimler);

        isimler.set(2, "Ulvi");  // verilen indexteki elemani degistirmek
        System.out.println("isimler = " + isimler);

        boolean varMi= isimler.contains("Burak");
        System.out.println("varMi = " + varMi);

        isimler.remove(1);  // rakam verildiginde index olarak görür ve siler
        System.out.println("isimler = " + isimler);

        int Index0fSelda=isimler.indexOf("Selda"); // verilenin index ini gösterir
        System.out.println("Index0fSelda = " + Index0fSelda);

        String ilkEleman= isimler.get(0);  // verilen indexteki elemani verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();  // Listi temizler
        System.out.println("isimler = " + isimler);








    }
}
