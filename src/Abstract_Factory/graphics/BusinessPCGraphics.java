package Abstract_Factory.graphics;

public class BusinessPCGraphics implements PCGraphics{

    private String name = "AMD RADEON VEGA 8";

    @Override
    public PCGraphics getGraphics() {
        System.out.println("Creating new graphics " + name);
        return new BusinessPCGraphics();
    }
}
