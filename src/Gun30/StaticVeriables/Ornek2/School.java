package Gun30.StaticVeriables.Ornek2;

public class School {
    public static void main(String[] args) {
        Student s1=new Student(1, "Ismet Temur");
        Student s2=new Student(2, "Mehmet Yilmaz ");
        Student s3=new Student(3, "Esma Dengesik");
        Student s4=new Student(6, "Cilem Okkali");
        // Problem: hem id yi takip etmek zorundayim,
        // hem de hata olasiligi yüksek

        Student s11=new Student( "Ismet Temur");
        Student s12=new Student( "Mehmet Yilmaz ");
        Student s13=new Student( "Esma Dengesik");
        Student s14=new Student( "Cilem Okkali");

        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);
        System.out.println(s14);

    }
}
