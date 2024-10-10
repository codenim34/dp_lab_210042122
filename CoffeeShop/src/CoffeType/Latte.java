package CoffeType;

import Condiments.ICondimentsDecorator;

public class Latte extends Coffee {
    public Latte(double basePrice) {
        super(basePrice);
    }

    public Latte(ICondimentsDecorator ICondimentsDecorator, double basePrice) {
        super(ICondimentsDecorator, basePrice);
    }

    public String Description(){
        return  "CoffeType :Latte";
    }

    public double Cost (){
        return 400.0;
    }



}
