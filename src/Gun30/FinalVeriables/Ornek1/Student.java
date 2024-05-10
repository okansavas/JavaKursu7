package Gun30.FinalVeriables.Ornek1;

public class Student {
    final int id;  // final degiskenlere , ya tanimlandiginda ya da constructor da
                   // deger atanabilir ve sonra degistirilemez.
    String fullName;
    private static int sayac=1; // sadece class in icinde erisilebilir



    public Student(String fullName) {
        this.fullName = fullName;
        this.id=sayac++;


    }

    @Override
    public String toString() {
        // this.id=56;  // daha sonradan deger atanamasin degistirilmesin

        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

