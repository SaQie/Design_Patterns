package Abstract_Factory.ram;

public class GamingPCRam implements PCRam{

    private String name = "PATRIOT VIPER 4";

    @Override
    public PCRam getRam() {
        System.out.println("Creating new " + name);
        return new GamingPCRam();
    }
}
