package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz(); // veri almayan, veri döndürmeyen
        merhabaYaz();

merhabaYazIsme("Okan");  // veri aliyor, veri döndürmüyor
merhabaYazCok(5);  // veri aliyor, veri döndürmüyor


    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsme(String ad) {
        System.out.println("Merhaba"+ad);

    }
    public static void merhabaYazCok(int miktar) {
        for(int i=0; i < miktar; i++) {
            System.out.println("Merhaba");
        }
    }

}
