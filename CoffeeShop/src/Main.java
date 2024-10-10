import CoffeType.Coffee;
import CoffeType.Espresso;
import Condiments.ICondimentsDecorator;
import Condiments.MilkCondiment;

public class Main {
    public static void main(String[] args) {

     ICondimentsDecorator condiment= new MilkCondiment();

        Coffee expresso = new Espresso(200.00);
        System.out.println(expresso.Description());
        System.out.println(expresso.Cost());
        expresso.addCondiment(condiment);
        expresso.addCondiment(condiment);
        System.out.println(expresso.Description());
        System.out.println(expresso.Cost());







    }
}