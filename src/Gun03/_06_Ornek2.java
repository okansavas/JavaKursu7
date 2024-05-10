package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // kisinin kilosunu(kg) ve boyunu(m) kendiniz veriniz.
        // kilo ve boy küsuratli olacak (65.4 kilo, 1.65 m gibi)
        // ekrana kilonuz: .... ve boyunuz= .... yazdiktan sonra
        // vücut kitle indeksini bulunuz  : kilo / (boy*boy)


        double kg=81.5;
        double boy=1.78;

        System.out.println("kilonuz= " + kg + " boyunuz=" + boy);

        double vke= kg / (boy*boy);
        System.out.println("Vücut Kitle Endeksiniz = " + vke);
        }


    }

