package Gun29.Protected.Protected1;

import Gun29.Protected.Protected1.Doktor;

public class HastaneAnkara {
    // merkez hastane
    public static void main(String[] args) {
        Doktor d1=new Doktor();
        d1.adi="Ismet";
        d1.bolum="Dahiliye";
        d1.hastaneAdi="Ankara Hastanesi";
        // d1.sicilNo erisilemez cunku private

        Doktor d2=new Doktor("Mehmet");




    }
}
