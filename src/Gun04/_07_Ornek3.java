package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {
        // String olarak verilen 3 notun ("82", "95", "56") ortalamasini bulunuz.

        String strNot1="95";
        String strNot2="82";
        String strNot3="56";

        double dNot1= Double.parseDouble(strNot1);
        double dNot2= Double.parseDouble(strNot2);
        double dNot3= Double.parseDouble(strNot3);

        double ort= (dNot1+dNot2+dNot3) /3;

        System.out.println("ort = " + ort);

    }
}
