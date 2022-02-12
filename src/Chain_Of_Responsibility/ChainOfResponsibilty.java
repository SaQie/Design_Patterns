package Chain_Of_Responsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChainOfResponsibilty {
    public static void main(String[] args) {
        List<Chain> chainList = new ArrayList<>();
        chainList.add(new PasswordLengthChain());
        chainList.add(new PasswordContainsCharacterChain());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your username.");
        String username = scanner.nextLine();
        System.out.println("Input your password.");
        String password = scanner.nextLine();
        boolean chains = false;
        for (Chain chain : chainList) {
            chains = chain.chain(password);
            if (!chains){
                break;
            }
        }
        if (chains){
            System.out.println("Succesfull register !");
        }

    }
}
