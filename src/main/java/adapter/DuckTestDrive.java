package adapter;

public class DuckTestDrive {
    public static void main(String[] args){
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가말하길");
        testDuck(duck);

        //turkey -> duck
        System.out.println("칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);
    }

    /**
     * 칠면조가 말하길
     * 골골
     * 짧은 거리를 날고 있어요
     *
     * 오리가말하길
     * 꽥
     * 날고 있어요
     * 칠면조 어댑터가 말하길
     * 골골
     * 짧은 거리를 날고 있어요
     * 짧은 거리를 날고 있어요
     * 짧은 거리를 날고 있어요
     * 짧은 거리를 날고 있어요
     * 짧은 거리를 날고 있어요
     *
     */

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
