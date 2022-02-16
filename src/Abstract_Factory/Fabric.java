package Abstract_Factory;

public class Fabric {

    protected Computer createComputer(String model){
        Computer computer = null;
        if (model.equalsIgnoreCase("gaming")){
            computer = new GamingComputer(new GamingComputerFactory());
        } else if (model.equalsIgnoreCase("business")){
            computer = new BusinessComputer(new BusinessComputerFactory());
        }
        return computer;
    }
}
