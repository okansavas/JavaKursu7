package Gun37;

public class _04_Soru {
    // Canli digital saat yapiniz
    // 21:32:45 --> 21:32:46 --> 21:32:47... --> 21:33:00 --> ... devam
    // ayni yere yazacak

    // Thread.sleep(1000); 1 sn bekletme komutu

    public static void main(String[] args) {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\r" + saat.format(f));

            Thread.sleep(1000);
        }



    }
}
