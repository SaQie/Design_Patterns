package Command;

public class TurnOffTv implements Command{

    private ElectronicDevice device;

    public TurnOffTv(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
