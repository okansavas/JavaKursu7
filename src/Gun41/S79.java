package Gun41;

public class S79 {
    public static void main(String[] args) {
       String[] arr={"A", "B", "C", "D"};

       for(int i=0; i<arr.length; i++) {
           System.out.println(arr[i]+""); // ABCD

           if(arr[i].equals("D")){
               System.out.println("Work Done"); // Work Done
               break;
           }

       }




    }
}
