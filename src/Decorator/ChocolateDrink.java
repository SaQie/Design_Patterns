package Decorator;

public class ChocolateDrink extends Drink{

    @Override
    public double getPrice() {
        return 2.20;
    }

    @Override
    public String description() {
        return "Chocolate drink";
    }
}
