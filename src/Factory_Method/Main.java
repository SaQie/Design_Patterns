package Factory_Method;

public class Main {
    public static void main(String[] args) {
        //Create new object
        IceCreamFactory iceCreamFactory = new IceCreamFactoryImpl();
        IceCream strawberry = iceCreamFactory.getIceCream("Strawberry");
        System.out.println("You select: " + strawberry.getName() + " Calories: " + strawberry.getCalories() + " Price: " + strawberry.getPrice() + " zł");
        IceCream oreo = iceCreamFactory.getIceCream("Oreo");
        System.out.println("You select: " + oreo.getName() + " Calories: " + oreo.getCalories() + " Price: " + oreo.getPrice() + " zł");
    }
}
