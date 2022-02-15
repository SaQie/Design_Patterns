package Decorator;

public class Decorator {
    public static void main(String[] args) {
        Drink chocolate = new ChocolateDrink();
        System.out.println(chocolate.description());
        System.out.println(chocolate.getPrice() + " zł");
        Drink oreoCookies = new OreoCookies(chocolate);
        System.out.println(oreoCookies.description());
        System.out.println(oreoCookies.getPrice() + " zł");
        Drink sprinkles = new Sprinkles(chocolate);
        System.out.println(sprinkles.description());
        System.out.println(sprinkles.getPrice() + " zł");
        Drink whippedCream = new WhippedCream(chocolate);
        System.out.println(whippedCream.description() );
        System.out.println(whippedCream.getPrice() + " zł");
    }
}
