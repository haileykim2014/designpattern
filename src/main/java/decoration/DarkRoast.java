package decoration;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
        //description comes from Beverage
    }

    @Override
    public double cost() {
        return .99;
    }
}
