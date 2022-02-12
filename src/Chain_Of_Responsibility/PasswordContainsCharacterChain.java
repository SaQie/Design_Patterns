package Chain_Of_Responsibility;

public class PasswordContainsCharacterChain implements Chain{

    @Override
    public boolean chain(String password) {
        if (password.contains("!") || password.contains("@") || password.contains(".") || password.contains(",")){
            return true;
        }else{
            System.out.println("Password must have one special character (!@,.)");
            return false;
        }
    }
}
