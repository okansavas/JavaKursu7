package Gun39;

public class _07_JavaCheckedveUncheckedException {
    public static void main(String[] args) {
        String kelime="";

        try {
            char ilkHarf=kelime.charAt(0);
            // sen bilirsin ister try catch e al, ister alma: Unchecked Exception
        }
         catch (Exception ex) {
             System.out.println("hata olustu");
         }

        try {
            Thread.sleep(1000); // Java nin zorunlu try catch tuttugu kodlara Checked Exception
        }
          catch (InterruptedException e) {
              System.out.println("hata olustu");
          }



    }
}
