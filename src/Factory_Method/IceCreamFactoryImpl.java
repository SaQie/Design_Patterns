package Factory_Method;

public class IceCreamFactoryImpl implements IceCreamFactory{

    public IceCream getIceCream(String iceCreamName){
        return switch (iceCreamName) {
            case "Strawberry" -> new StrawberryIceCream(100, 2.50);
            case "Oreo" -> new OreoIceCream(150, 3.99);
            default -> null;
        };
    }

}
