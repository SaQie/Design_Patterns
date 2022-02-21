package Facade;

public class HomeLight implements Light{

    @Override
    public void on() {
        System.out.println("Home light on.");
    }

    @Override
    public void off() {
        System.out.println("Home light off.");
    }
}
