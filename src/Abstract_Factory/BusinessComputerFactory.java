package Abstract_Factory;

import Abstract_Factory.cooling.BusinessPCCooling;
import Abstract_Factory.cooling.PCCooling;
import Abstract_Factory.disk.BusinessPCDisk;
import Abstract_Factory.disk.PCDisk;
import Abstract_Factory.graphics.BusinessPCGraphics;
import Abstract_Factory.graphics.PCGraphics;
import Abstract_Factory.processor.BusinessPCProcessor;
import Abstract_Factory.processor.PCProcessor;
import Abstract_Factory.ram.BusinessPCRam;
import Abstract_Factory.ram.PCRam;

public class BusinessComputerFactory implements ComputerFactory{

    @Override
    public PCDisk createDisk() {
        return new BusinessPCDisk();
    }

    @Override
    public PCGraphics createGraphics() {
        return new BusinessPCGraphics();
    }

    @Override
    public PCRam createRam() {
        return new BusinessPCRam();
    }

    @Override
    public PCProcessor createProcessor() {
        return new BusinessPCProcessor();
    }

    @Override
    public PCCooling createColling() {
        return new BusinessPCCooling();
    }
}
