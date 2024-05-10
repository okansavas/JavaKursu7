package Gun29.ClassErisimleri.PaketIki;

import Gun29.ClassErisimleri.PaketBir.DefaultErisim;
import Gun29.ClassErisimleri.PaketBir.PublicErisim;

public class DigerPaketMain {
    public static void main(String[] args) {
        PublicErisim pe=new PublicErisim();
       // DefaultErisim de=new DefaultErisim();
        // cannot be accessed
        // diger paketlerden default belirtecli class a
        // erisilemez. yalnizca kendi paketindekiler erisebilir



    }
}
