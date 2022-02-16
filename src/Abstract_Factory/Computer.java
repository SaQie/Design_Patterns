package Abstract_Factory;

import Abstract_Factory.cooling.PCCooling;
import Abstract_Factory.disk.PCDisk;
import Abstract_Factory.graphics.PCGraphics;
import Abstract_Factory.processor.PCProcessor;
import Abstract_Factory.ram.PCRam;

public abstract class Computer {

    protected PCDisk disk;
    protected PCGraphics graphics;
    protected PCCooling cooling;
    protected PCProcessor processor;
    protected PCRam ram;

}
