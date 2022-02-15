package Decorator;

public class WhippedCream extends DrinkAcessoriesDecorator{

    private Drink drink;

    public WhippedCream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.80;
    }

    @Override
    public String description() {
        return drink.description() + " with whipped cream.";
    }
}
