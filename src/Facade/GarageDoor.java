package Facade;

public class GarageDoor implements Door{

    @Override
    public void open() {
        System.out.println("Garage door open.");
    }

    @Override
    public void close() {
        System.out.println("Garage door close.");
    }
}
