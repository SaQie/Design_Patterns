package Abstract_Factory.cooling;

public class BusinessPCCooling implements PCCooling{

    private String name = "SILENTUM PC FERRA 3";

    @Override
    public PCCooling getCooling() {
        System.out.println("Creating new " + name);
        return new BusinessPCCooling();
    }
}
