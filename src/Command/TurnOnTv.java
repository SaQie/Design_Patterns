package Command;

public class TurnOnTv implements Command{

    private ElectronicDevice device;

    public TurnOnTv(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
