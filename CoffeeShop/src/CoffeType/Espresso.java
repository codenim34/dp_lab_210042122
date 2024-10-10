package CoffeType;

import Condiments.ICondimentsDecorator;

public class Espresso extends Coffee {


    public Espresso(double basePrice) {
        super(basePrice);
    }

    public Espresso(ICondimentsDecorator ICondimentsDecorator, double basePrice) {
        super(ICondimentsDecorator, basePrice);
    }


}
