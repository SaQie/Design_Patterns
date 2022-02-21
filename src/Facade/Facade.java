package Facade;

public class Facade {
    private Door garageDoor = new GarageDoor();
    private Door homeDoor = new HomeDoor();
    private Light garageLight = new GarageLight();
    private Light homeLight = new HomeLight();

    public void welcomeHome(){
        System.out.println("Welcome home.. !");
        System.out.println("========================");
        garageDoor.open();
        garageLight.on();
        homeDoor.open();
        homeLight.on();
        System.out.println("========================");
    }

    public void leaveHome(){
        System.out.println("See you later.. !");
        System.out.println("========================");
        garageDoor.close();
        garageLight.off();
        homeLight.off();
        homeDoor.close();
        System.out.println("========================");
    }
}
