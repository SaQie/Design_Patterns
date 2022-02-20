package Adapter;

public class UserAdapter implements UserInformation {

    private OldUser oldUser;

    public UserAdapter(OldUser oldUser) {
        this.oldUser = oldUser;
    }

    @Override
    public String getName() {
        return oldUser.getName();
    }

    @Override
    public int getAge() {
        return oldUser.getAge();
    }

    @Override
    public Adress getAdress() {
        String[] split = oldUser.getAdress().split(",");
        return new Adress(split[0],split[1]);
    }
}
