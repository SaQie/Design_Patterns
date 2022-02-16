package Abstract_Factory.graphics;

public class GamingPCGraphics implements PCGraphics{

    private String name = "RTX 3060 SUPER ";

    @Override
    public PCGraphics getGraphics() {
        System.out.println("Creating new graphics " + name);
        return new GamingPCGraphics();
    }
}
