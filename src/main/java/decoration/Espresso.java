package decoration;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
        //description comes from Beverage
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
