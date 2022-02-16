package Abstract_Factory;

public class BusinessComputer extends Computer{
    ComputerFactory computerFactory;


    public BusinessComputer(ComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
        createBusinessComputer();
    }

    public void createBusinessComputer(){
        ram = computerFactory.createRam().getRam();
        graphics = computerFactory.createGraphics().getGraphics();
        processor = computerFactory.createProcessor().getProcessor();
        disk = computerFactory.createDisk().getDisk();
        cooling = computerFactory.createColling().getCooling();
    }
}
