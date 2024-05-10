package Gun41;

public class S46 {
    public static void main(String[] args) {
        String names[]={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];


        int idx=0;
        try {
            for (String n:names) { // Thomas, Peter
                pwd[idx] = n.substring(2,6); // 0 -> omas
                idx++;
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid Name");
        }
        for (String p:pwd)
            System.out.println(p); // invalid, omas, null, null



    }
}
