package Command;

public class VolumeDownTv implements Command{

    private ElectronicDevice device;

    public VolumeDownTv(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
