package Gun42;

public class S152 {
    public static void main(String[] args) {
        int n[][] = {{1,3},
                      {2,4}};

        for (int i=n.length -1; i>=0; i--) {  // i:1,0
            for(int y:n[i]) {
                System.out.println(y);
            }
        }



    }
}
