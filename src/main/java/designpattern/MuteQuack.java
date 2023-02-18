package designpattern;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("nothing to do");
        System.out.println("can't say");
    }
}
