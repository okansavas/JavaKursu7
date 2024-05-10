package Gun39;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        System.out.println("Program Basladi");
        String str="";
        long startTime=0;

       try {
           startTime = System.currentTimeMillis();
           System.out.println("Hatadan önceki kisim");
           char ilkHarf = str.charAt(3);
           System.out.println("Hatadan sonraki kisim");
       }
       catch (Exception ex)
       {
           System.out.println("Hata oldugunda calisan kisim");
       }
       finally { // hata olsada calisir, olmasada calisacak kisim
           long gecenSure=System.currentTimeMillis()-startTime;
           System.out.println("gecenSure = " + gecenSure);
           System.out.println("try-catch bloguyla ilgili son yapilacaklar");

       }

        System.out.println("diger kodlar");
        System.out.println("program bitti.");






    }
}
