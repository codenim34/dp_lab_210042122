package CoffeType;

import Condiments.ICondimentsDecorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
     protected List<ICondimentsDecorator> condimentsDecorators = new ArrayList<>();
     private double basePrice;

     public Coffee(double basePrice) {
          this.basePrice = basePrice;
     }

     public Coffee(ICondimentsDecorator ICondimentsDecorator, double basePrice) {
          this.condimentsDecorators.add(ICondimentsDecorator);
          this.basePrice = basePrice;
     }

     public void addCondiment(ICondimentsDecorator condiment) {
          this.condimentsDecorators.add(condiment);
     }

     public String Description() {
          StringBuilder description = new StringBuilder("Basic Coffee");
          for (ICondimentsDecorator condiment : condimentsDecorators) {
               description.append(condiment.getDescription());
          }
          return description.toString();
     }

     public double Cost() {
          double totalCost = basePrice;
          for (ICondimentsDecorator condiment : condimentsDecorators) {
               totalCost += condiment.Cost();
          }
          return totalCost;
     }
}