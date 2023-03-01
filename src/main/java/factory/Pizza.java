package factory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<String>();

  public void prepare() {
    System.out.println("prepare:" + name);
    System.out.println("dough");
    System.out.println("sauce");
    System.out.println("toopping");
    for (String topping : toppings) {
      System.out.println(" " + toppings);
    }
  }

  void bake() {
    System.out.println("baking..");
  }

  void cut() {
    System.out.println("cutting..");
  }

  void box() {
    System.out.println("boxing");
  }

  public String getName(){
    return name;
  }
}
