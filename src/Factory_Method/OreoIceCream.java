package Factory_Method;

public class OreoIceCream implements IceCream{

    private int calories;
    private String name;
    private double price;

    public OreoIceCream(int calories, double price) {
        this.calories = calories;
        this.price = price;
        this.name = "Oreo ice cream.";
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
