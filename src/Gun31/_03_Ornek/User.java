package Gun31._03_Ornek;

public class User {

    String userName;
    Role role;
    Statu statu;

    public User(String userName, Role role, Statu statu) {
        this.userName = userName;
        this.role = role;
        this.statu = statu;
    }

    public static void userSil(User user) {

        if(user.role == Role.ADMIN)
            System.out.println("Admin Silinemez");
        else
            user.statu = Statu.PASIF;

    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
