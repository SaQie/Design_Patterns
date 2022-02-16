package Abstract_Factory.disk;

public class GamingPCDisk implements PCDisk{
    String name = "NVME Disk 1TB";
    @Override
    public PCDisk getDisk() {
        System.out.println("Creating new " + name);
        return new GamingPCDisk();
    }
}
