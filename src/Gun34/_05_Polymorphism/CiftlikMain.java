package Gun34._05_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabas");
        kopek1.ses(); // havladi
        kopek1.kokladi(); // kokladi

        Kedi kedi1=new Kedi("köpük");
        kedi1.ses();  // miyavladi
        kedi1.tirmaladi(); // tirmaladi

        kopekSesi(kopek1);
        kediSesi(kedi1);

        System.out.println("************************");

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);
        // hem kendi türünde hem de extend oldugu tür
        // de de olabilmesine cok bicimlilik yani
        // Polymorphism denir

        //        HashMap<String,String> m1=new HashMap();
//        ArrayList<String> l1=new ArrayList<>();
//
//        Map<String,String> m2=new HashMap<>();
//        Map<String,String> m3=new TreeMap<>();
//        Map<String,String> m4=new LinkedHashMap<>();
//        List<String> l2=new ArrayList<>();

        Hayvan hay1=new Hayvan("Kurbaga");
        Hayvan kopek2=new Hayvan("kangal");
        Hayvan kedi2=new Hayvan("boncuk");

        System.out.println("******************************");

        hay1.ses(); // ses cikardi
        kopek2.ses(); // hayvan kiliginda köpek, havladi
        kedi2.ses(); // hayvan kiliginda kedi, miyavladi

        ((Kopek)kopek2).kokladi(); // sen aslinda köpeksin
        ((Kedi)kedi2).tirmaladi(); // sen aslinda kedisin



    }
    public static void hayvanSesi(Hayvan h){
        // h nin tipi alsan kendi tipi olacak
        h.ses();  // herkes kendi sesini cikarir

        // buraya gelenin kedi mi köpek mi oldugunu nasil anlariz
        if(h instanceof Kopek)
            ((Kopek)h).kokladi();

        if (h instanceof Kedi)
            ((Kedi)h).tirmaladi();

    }


    public static void kopekSesi(Kopek kp){
       kp.ses();  // havladi

    }
    public static void kediSesi(Kedi kd){
        kd.ses();  // miyavladi

    }
}
