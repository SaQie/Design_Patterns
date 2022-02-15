package Decorator;

public class Sprinkles extends DrinkAcessoriesDecorator{

    private Drink drink;

    public Sprinkles(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.50;
    }

    @Override
    public String description() {
        return drink.description() + " with colorful sprinkles.";
    }
}
