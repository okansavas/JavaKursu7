package Gun29.Private_Erisim;

public class Calisan {
    int id; // default - sadece ayni paket erisimi
    String name; // default
    String surname; // default
    private String password;

    public void sifreAta(String sifre) {
        if (sifre.length() >= 8)
            this.password=sifre;
        else
            System.out.println("zayif");
    }

    public void sifreGoster() {
        System.out.println("*****"+
                this.password.substring(4));

    }


}
