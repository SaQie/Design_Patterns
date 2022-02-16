package Abstract_Factory;

import Abstract_Factory.cooling.GamingPCCooling;
import Abstract_Factory.cooling.PCCooling;
import Abstract_Factory.disk.GamingPCDisk;
import Abstract_Factory.disk.PCDisk;
import Abstract_Factory.graphics.GamingPCGraphics;
import Abstract_Factory.graphics.PCGraphics;
import Abstract_Factory.processor.GamingPCProcessor;
import Abstract_Factory.processor.PCProcessor;
import Abstract_Factory.ram.GamingPCRam;
import Abstract_Factory.ram.PCRam;

public class GamingComputerFactory implements ComputerFactory{

    @Override
    public PCDisk createDisk() {
        return new GamingPCDisk();
    }

    @Override
    public PCGraphics createGraphics() {
        return new GamingPCGraphics();
    }

    @Override
    public PCRam createRam() {
        return new GamingPCRam();
    }

    @Override
    public PCProcessor createProcessor() {
        return new GamingPCProcessor();
    }

    @Override
    public PCCooling createColling() {
        return new GamingPCCooling();
    }
}
