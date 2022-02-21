package Facade;

public class GarageLight implements Light{

    @Override
    public void on() {
        System.out.println("Garage light on.");
    }

    @Override
    public void off() {
        System.out.println("Garage light off.");
    }
}
