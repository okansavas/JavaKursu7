package Gun33._02_Inheritance;

public class Kedi extends Hayvan{
    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); // parent in constructer i devrede

        public void konustu(){
            //super.konustu();  // paretndekini calistirir
            System.out.println("miyavladi");
        }
    }
}
