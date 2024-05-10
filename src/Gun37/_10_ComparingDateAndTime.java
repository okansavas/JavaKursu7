package Gun37;

import java.time.LocalDate;

public class _10_ComparingDateAndTime {

    public static void main(String[] args) {
        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        boolean sonraMi= buGun.isAfter(dun); // bugun dunden sonra mi
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi= buGun.isBefore(dun); // bugün dün den önce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi= buGun.isEqual(dun); // bugün dün e esit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYilmi= buGun.isLeapYear(); // artik yil mi Subat 29 u mu
        System.out.println("artikYilmi = " + artikYilmi);






    }
}
