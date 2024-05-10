package Gun07;

public class _04_StringConcat {
    public static void main(String[] args) {

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("birlesik hali="+s1+s2);
        System.out.println("birlesik hali="+s1.concat(s2));  // birlesik hali
        System.out.println("birlesik hali="+ s1.concat(" ").concat(s2));
        System.out.println("birlesik hali="+s1.concat(" "+s2));

        System.out.println("s1=" + s1);  // s1 in degeri degismedi
        System.out.println("s2=" + s2);  // s2 nin degeri degismedi




    }
}
