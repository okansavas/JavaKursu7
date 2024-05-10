package Gun39;

public class _01_JavaException {
    public static void main(String[] args) {
        // Except -> beklenmeyen, istisna

        System.out.println("program calismaya basladi");

        String kelime="";
        char harf=kelime.charAt(3);  //Runtime Error

        System.out.println("program bitti");

        // Yazili programi -> calisir hale dönüstürmeye: DERLEMEK, COMPILE

    }
    // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.(Syntax hatasi)

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.
}
