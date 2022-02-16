package Abstract_Factory.disk;

public class BusinessPCDisk implements PCDisk{

    String name = "NVME M.2 256GB";

    @Override
    public PCDisk getDisk() {
        System.out.println("Creating new disk " + name);
        return new BusinessPCDisk();
    }
}
