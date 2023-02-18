package designpattern;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        System.out.println("I am a mallard");
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        System.out.println("I am a model");
        model.performFly(); //from FlyNoWay
        model.setFlyBehavior(new FlyRocketPowered()); //if I want to change duck's acting, I'll call setter with what I want
        model.performFly(); //from FlyRocketPowered
    }
}
