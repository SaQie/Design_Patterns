package Adapter;

public class NewUser implements UserInformation {

    private String name;
    private int age;
    private Adress adress;

    @Override
    public Adress getAdress() {
        return adress;
    }

    public NewUser(String name, int age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
