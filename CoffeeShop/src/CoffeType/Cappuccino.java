package CoffeType;

import Condiments.ICondimentsDecorator;

public class Cappuccino extends Coffee {

    public Cappuccino(double basePrice) {
        super(basePrice);
    }

    public Cappuccino(ICondimentsDecorator ICondimentsDecorator, double basePrice) {
        super(ICondimentsDecorator, basePrice);
    }

    public String Description(){
        return "Cofee type: Cappuccino ";
    }
    public double Cost (){
        return 600.0;
    }
    public String Description(ICondimentsDecorator condimentsDecorator){
        return "Cofee type: Cappuccino  " + condimentsDecorator.getDescription();
    }
    public double Cost (ICondimentsDecorator condimentsDecorator){
        return 600.0 + condimentsDecorator.Cost();
    }

}
