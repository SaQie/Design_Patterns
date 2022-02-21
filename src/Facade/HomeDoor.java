package Facade;

public class HomeDoor implements Door{

    @Override
    public void open() {
        System.out.println("Home door open.");
    }

    @Override
    public void close() {
        System.out.println("Home door close.");
    }
}
