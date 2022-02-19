package Command;

public class VolumeUpTv implements Command{

    private ElectronicDevice device;

    public VolumeUpTv(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
