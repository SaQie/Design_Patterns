package Abstract_Factory.processor;

public class BusinessPCProcessor implements PCProcessor{

    private String name = "AMD RYZEN 5 3600X";

    @Override
    public PCProcessor getProcessor() {
        System.out.println("Creating new " + name);
        return new BusinessPCProcessor();
    }
}
