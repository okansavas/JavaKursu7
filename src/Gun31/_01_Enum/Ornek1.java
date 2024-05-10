package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ay noya göre, ayin gün sayisini
        // veren programi yaziniz

        int ayNo = 5;  // Mayis

        switch (ayNo) {
            case 2:
                System.out.println(28);
                break;
            case 1: // Ocak
            case 3: // Mart
            case 5: //Mayis
            case 22:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }

        if (ayNo == 6) { // haziran ayi
            // zam yap
        }


        // Admin en yetkili kullanici 0 Ebuzer Hoca
        // Student - Hatun 1
        // Accountant - Muhasebeci 2

       // if (kullanici_Yetkisi == 3) { // muhasabe

        }
    }

