package decoration;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage; //감싸고자하는 음료객체 전달 방식
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
        //첨가되는 아이템오 추가
        //먼저 장식하고있는 객체에 위임한 다음, 그 결과에 '모카'를 더한 값을 리턴
    }

    public double cost() {
        return beverage.cost() + .20;
        //음료 가격에 모카를 추가한 가격을 계산
        //장식하고있는 객체에 가격을 구하는 작업을 위임해서 음료값을 구한 다음, 거기에 모카가격을 더하고 합을 리턴
    }
}
