package Condiments;

public class WhiteSugarCondiment implements ICondimentsDecorator {

    @Override
    public String getDescription() {
        return " Condiments : White Sugar ";
    }

    @Override
    public double Cost() {
        return 50.00;
    }


}
