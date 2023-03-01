package factory;

public class ChicagoStyleCheesePizza extends Pizza{
  public ChicagoStyleCheesePizza(){
    name ="Chicago style deep dish cheese pizza";
    dough = "very thick crusted dough";
    sauce = "tomato sauce";
    toppings.add("sliced mozzarella cheese");
  }
  void cut(){
    System.out.println("cutting square pizza");
  }

}
