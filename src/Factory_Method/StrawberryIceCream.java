package Factory_Method;

public class StrawberryIceCream implements IceCream{

    private int calories;
    private String name;
    private double price;

    public StrawberryIceCream(int calories, double price) {
        this.calories = calories;
        this.price = price;
        this.name = "Strawberry ice cream.";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
