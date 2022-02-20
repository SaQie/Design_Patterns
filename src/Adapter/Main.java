package Adapter;

public class Main {
    public static void main(String[] args) {
        UserInformation user = new NewUser("Kamil", 20, new Adress("Wroclaw", "Kombatantow"));
        OldUser oldUser = new OldUser("Michał", 23, "Warsaw,Katowicka");
        UserInformation userAdapter = new UserAdapter(oldUser);
        System.out.println(user.getAdress().getStreet());
        System.out.println(userAdapter.getAdress().getStreet());
    }
}
