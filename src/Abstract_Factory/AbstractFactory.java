package Abstract_Factory;

public class AbstractFactory {
    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        fabric.createComputer("business");
    }
}
