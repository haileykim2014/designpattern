package decoration;

public abstract class CondimentDecorator extends Beverage{
    //첨가물 클래스
    public Beverage beverage; //음료 지정할때 데코레이터에서 어떤 음료든 감쌀 수 있도록
    public abstract String getDescription(); //모든 첨가물 데코레이터에서 구현

    public Size getSize(){
        return beverage.getSize();
    }
}
