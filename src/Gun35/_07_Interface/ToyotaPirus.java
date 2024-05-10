package Gun35._07_Interface;

public class ToyotaPirus extends Vehicle implements IElectric, IGas{
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "10 binde bir degistir.";
    }

    @Override
    public String changeOil() {
        return "her 500 kmde benzin al.";
    }

    @Override
    public String drive() {
        return "istedigin gibi sür";
    }
}
