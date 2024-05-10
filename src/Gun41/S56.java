package Gun41;

public class S56 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[] = new String[3];
        int idx = 0;


        try {
            for (String n : names) {  // Thomas, Peter
                pwd[idx] = n.substring(2, 6); // 2 dahil, 5 dahil
                System.out.println(pwd[idx]); // omas
                idx++;
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid Name"); // Invalid Name
        }

    }
}
