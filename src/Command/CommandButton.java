package Command;

public class CommandButton {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressKey(){
        command.execute();
    }

    public void undoKey(){
        command.undo();
    }
}
