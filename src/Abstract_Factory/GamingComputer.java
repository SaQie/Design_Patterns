package Abstract_Factory;

public class GamingComputer extends Computer{
    ComputerFactory computerFactory;


    public GamingComputer(ComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
        createGamingComputer();
    }

    public void createGamingComputer(){
        ram = computerFactory.createRam().getRam();
        graphics = computerFactory.createGraphics().getGraphics();
        processor = computerFactory.createProcessor().getProcessor();
        disk = computerFactory.createDisk().getDisk();
        cooling = computerFactory.createColling().getCooling();
    }
}
