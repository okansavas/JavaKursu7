package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    static void universiteKurallari(){
        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın ");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
    }




    void dersEkle(Lesson ders){

        // dersleri listesinde derslerin miktari
        // max saat a ulasmamissa
        // 1.ders geldiginde 0 saat var, eklenebilir
        // 2.ders geldiginde 3 saat var, eklenebilir
        // 3.ders geldiginde 9 saat var, eklenebilir
        int listedevarolanToplamSaat=0;
for(Lesson d: this.dersleri)
    listedevarolanToplamSaat+=d.saat;

if(listedevarolanToplamSaat + ders.saat <10)
     this.dersleri.add(ders);
else
    System.out.println("Max saat i astiniz ders eklenemez");
    }

}
