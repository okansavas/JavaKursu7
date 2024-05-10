package Gun41;

public class S54 {
    public static void main(String[] args) {
        int cnt=0;
        String[][] arr= {
                {"A","B","C"},
                {"D", "E"}
        };

        for(int i=0; i< arr.length; i++) {

            for(int j=0; j<arr[i].length; j++) {
                System.out.println(arr[i][j]+ ""); // A,B,C,D

                if(arr[i][j].equals("B")) {
                    break;
                }
            }
            continue; // etkisiz
        }



    }
}
