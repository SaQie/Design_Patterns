package Abstract_Factory.ram;

public class BusinessPCRam implements PCRam{

    private String name = "RAM PNY XLR8";

    @Override
    public PCRam getRam() {
        System.out.println("Creating new " + name);
        return new BusinessPCRam();
    }
}
