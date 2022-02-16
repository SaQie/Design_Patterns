package Abstract_Factory;

import Abstract_Factory.cooling.PCCooling;
import Abstract_Factory.disk.PCDisk;
import Abstract_Factory.graphics.PCGraphics;
import Abstract_Factory.processor.PCProcessor;
import Abstract_Factory.ram.PCRam;

public interface ComputerFactory {

    PCDisk createDisk();
    PCGraphics createGraphics();
    PCRam createRam();
    PCProcessor createProcessor();
    PCCooling createColling();

}
