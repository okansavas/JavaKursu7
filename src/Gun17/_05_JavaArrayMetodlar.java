package Gun17;

import java.util.Arrays;

public class _05_JavaArrayMetodlar {
    public static void main(String[] args) {
        String[] isimler={"Ahmet","Zeynep","Roman","Cihan"};

        // diziyi ekrana direkt yazdirmak
        System.out.println("isimler =" + Arrays.toString(isimler));

        // dizi siralama, düzenleme
        Arrays.sort(isimler);
        System.out.println("isimler="+Arrays.toString(isimler));

        int[] a={1,8,65,45};
        Arrays.sort(a);
        System.out.println("en kücük =" + a[0]);
        System.out.println("en büyük =" + a[a.length-1]);

        // Elemanlari hizla doldurma ayni degerle
        Arrays.fill(a,5); // hepsine 5 doldur
        System.out.println("a=" + Arrays.toString(a));



    }
}
