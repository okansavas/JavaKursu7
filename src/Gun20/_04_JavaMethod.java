package Gun20;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // bir sayinin tek mi cift mi oldugunu yazdiriniz

        int sayi=55;

        // 1.Yöntem
        if(sayi%2 == 0)
            System.out.println("Cift");
        else
            System.out.println("Tek");

        // 2.Yöntem

        tekMiCiftMiYaz(60);
        tekMiCiftMiYaz(55);
        tekMiCiftMiYaz(46);



    }

    public static void tekMiCiftMiYaz(int sayi){
    if(sayi%2==0)
        System.out.println(sayi+" : Cift");
    else
        System.out.println(sayi+": Tek");


    }
}
