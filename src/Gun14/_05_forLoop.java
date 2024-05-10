package Gun14;

public class _05_forLoop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayilari ekrana yazdiriniz

        int sayac=1;
        while (sayac<=5) {

            System.out.println("sayac while =" + sayac);
            sayac ++;
        }

        // Javayi yazanlar demisler ki
        // bir döngünün basi belli, sonu belli, artis degeri belli ise
        // daha kolayi var
        for(sayac=1;sayac<=5;sayac++)
            System.out.println("sayac for =" + sayac);

        //Döngü kurali:
        // bir döngünün kac kere dönecegi belli ise : FOR
        // bir döngünün kac kere dönecegi belli degil ise: WHILE
        // while durumunda kontrol sonda ise: DO_WHILE





    }
}
