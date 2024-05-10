package Gun31._03_Ornek;

public class Campus {
    public static void main(String[] args) {


        User user1 = new User("Ismet", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Ayse", Role.PERSONEL, Statu.AKTIF);
        User user3 = new User("Cilem", Role.MUDUR, Statu.PASIF);

        User.userSil(user1);
        User.userSil(user2);
        System.out.println("user2 = " + user2);
    }
}