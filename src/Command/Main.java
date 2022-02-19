package Command;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();
        Command onTvCommand = new TurnOnTv(device);
        CommandButton commandButton = new CommandButton();
        commandButton.setCommand(onTvCommand);
        commandButton.pressKey();
        Command offTvCommand = new TurnOffTv(device);
        commandButton.setCommand(offTvCommand);
        commandButton.pressKey();
        commandButton.undoKey();
        Command volumeDownTv = new VolumeDownTv(device);
        commandButton.setCommand(volumeDownTv);
        commandButton.pressKey();
        commandButton.pressKey();
        commandButton.pressKey();
        commandButton.pressKey();
        commandButton.undoKey();
        commandButton.undoKey();
    }
}
