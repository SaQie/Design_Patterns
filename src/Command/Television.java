package Command;

public class Television implements ElectronicDevice{

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV now is on !");
    }

    @Override
    public void off() {
        System.out.println("TV now is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV Volume is at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV Volume is at " + volume);
    }
}
