package Abstract_Factory.cooling;

public class GamingPCCooling implements PCCooling{

    private String name = "SILENTUM PC FERRA 5";

    @Override
    public PCCooling getCooling() {
        System.out.println("Creating new " + name);
        return new GamingPCCooling();
    }
}
