package Gun35._06_Interface2;

public class Dikdortgen2 implements IGeometri2{
    @Override
    public void alani(int kkenar, int ukenar) {
        System.out.println(ukenar*kkenar);
    }

    @Override
    public void cevresi(int kkenar, int ukenar) {
        System.out.println((ukenar+kkenar)*2);

    }
}
