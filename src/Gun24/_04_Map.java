package Gun24;

import java.util.HashMap;

public class _04_Map {
    public static void main(String[] args) {
        // bir kartvizit uygulamasini 2 kisi icin yapiniz
        // isim, email, telefonu, adres


        HashMap<String, String> ZKartVizit=new HashMap<>();
        ZKartVizit.put("isim", "Zehra");
        ZKartVizit.put("email", "Zehra@gmail.com");
        ZKartVizit.put("telefon", "0505676767");
        ZKartVizit.put("adres", "Cekmeköy");

        System.out.println("ZKartVizit.get(isim) = " + ZKartVizit.get("isim"));
        System.out.println("ZKartVizit.get(email) = " + ZKartVizit.get("email"));

        HashMap<String, String> EKartVizit=new HashMap<>();
        EKartVizit.put("isim", "Esma");
        EKartVizit.put("email", "Esma@gmail.com");
        EKartVizit.put("telefon", "0506878787");
        EKartVizit.put("adres", "Besiktas");

        System.out.println("EKartVizit.get(isim) = " + EKartVizit.get("isim"));
        System.out.println("EKartVizit.get(email) = " + EKartVizit.get("email"));

        HashMap< String , HashMap<String, String>> kartvizitler=new HashMap<>();
        kartvizitler.put("Zehra", ZKartVizit);
        kartvizitler.put("Esma", EKartVizit);

        System.out.println("Zehranin emaili) = " + kartvizitler.get("Zehra").get("email"));
        System.out.println("Zehranin telefonu) = " + kartvizitler.get("Zehra").get("telefon"));

        System.out.println("Esmanin emaili) = " + kartvizitler.get("Esma").get("email"));
        System.out.println("Esmanin telefonu) = " + kartvizitler.get("Esma").get("telefon"));








    }
}
