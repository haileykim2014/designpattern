package designpattern;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("nothing to do");
        System.out.println("Can't fly");
    }
}
