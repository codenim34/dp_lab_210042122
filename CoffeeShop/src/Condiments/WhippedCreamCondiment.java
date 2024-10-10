package Condiments;

public class WhippedCreamCondiment implements ICondimentsDecorator {
    @Override
    public String getDescription() {
        return " Condiments : Milk";
    }

    @Override
    public double Cost() {
        return 50.00;
    }

}