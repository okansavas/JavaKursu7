package Gun38;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle=cumle+"Bugün"; // + isareti String lerde birlestirme yapar
        cumle=cumle+"hava";
        cumle=cumle+"soguk";

        System.out.println(cumle + "ve karli");
        System.out.println("cumle = " + cumle);  // atanmazsa en son hali gecerli

        cumle.concat(", yaz mevsimini ariyoruz");
        System.out.println(cumle);
        cumle=cumle.concat(", yaz mevsimini ariyoruz"); // atama gerektirir
        System.out.println(cumle);

        System.out.println("\n**** StringBuilder ***");
        /**** StringBuilder ***/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün");  //atama gerektirmez
        cumle2.append("hava");
        cumle2.append("soguk");

        System.out.println(cumle2);

        // +,concat, append(sb) : neden 3 tane var

        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i=0; i<30000; i++)
            test1 = test1 + "merhaba";

        System.out.println("+ icin gecen süre = " + (System.currentTimeMillis()-startTime+"ms"));

        startTime=System.currentTimeMillis();
        String test2="";
        for (int i=0; i<30000; i++)
            test2 = test2.concat("merhaba");

        System.out.println("concat icin gecen süre = " + (System.currentTimeMillis()-startTime+"ms"));

        startTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i=0; i<30000; i++)
            test3.append("merhaba"); // otomatik kendine ekliyor

        System.out.println("StringBuilder icin gecen süre = " + (System.currentTimeMillis()-startTime+"ms"));

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("****************************\n\n");
        /******* StringBuilder i biraz yakindan taniyalim ************/
        StringBuilder sb=new StringBuilder();
        sb.append("Bugün"); // kendine ekleme, atama gerektirmez (+ da ve concat de gerekirdi)
        sb.append("hava");
        sb.append("soguk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4); // diger tipleri stringe otomatik cevirip ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // String tersine ceviriyor
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5);  // (index) 0 dahil, 5 haric olmak üzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index teki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime"); // 5 nolu index e kelime yi ekle
        System.out.println("sb = " + sb);

        sb=new StringBuilder("Bugün hava soguk");
        sb.replace(3,8,"bu");
        System.out.println("sb = " + sb);

        String strSb= sb.toString(); // bütün string fonk kullanilabilir.

        StringBuffer sBuffer=new StringBuffer(); // tamamen StringBilder ile aynı
        // tek farkı, paralel çalıan yazılımlarda, StringBuffer kullanılır
        // örnek olarak oyunlarda aynı anda çıkan düşman savaşçı aynı anda ateş ediyor, alttada bir log olsa
        // yapılan işlemleri yazan string olarak bu durumda pararlel olan bu çalışmaya uygun sıralı birleştirme yapabilmesi lazım
        // işte bu gibi durumlarda kullanılır.







    }
}
