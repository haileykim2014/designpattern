package designpattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}
    public abstract void display();

    public void performFly(){

        flyBehavior.fly(); //delegate fly acting to FlyBehavior
    }

    public void performQuack(){
        quackBehavior.quack(); //delegate quack acting to QuackBehavior
    }

    public void swim(){
        System.out.println("all duck float on water. even fake ducks too");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
