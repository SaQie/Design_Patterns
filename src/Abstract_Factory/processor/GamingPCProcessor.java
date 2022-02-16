package Abstract_Factory.processor;

public class GamingPCProcessor implements PCProcessor{

    private String name = "AMD RYZEN 7 3700X";

    @Override
    public PCProcessor getProcessor() {
        System.out.println("Creating new " + name);
        return new GamingPCProcessor();
    }
}
