package Decorator;

public class OreoCookies extends DrinkAcessoriesDecorator{

    private Drink drink;

    public OreoCookies(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 1;
    }

    @Override
    public String description() {
        return drink.description() + " with oreo cookies.";
    }
}
