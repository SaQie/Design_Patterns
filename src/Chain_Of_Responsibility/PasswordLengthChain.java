package Chain_Of_Responsibility;

public class PasswordLengthChain implements Chain{

    @Override
    public boolean chain(String password) {
        if (password.length() < 5){
            System.out.println("Password must have 5 or more characters !");
            return false;
        }
        return true;
    }
}
