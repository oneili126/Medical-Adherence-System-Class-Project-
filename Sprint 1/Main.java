
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Authentication authentication = new Authentication();
        Scanner scr = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.println("Choose an option: ");
            int choice = scr.nextInt();

            if (choice == 1){
                System.out.println("Enter username: ");
                String username = scr.nextLine();
                System.out.println("Enter password: ");
                String password = scr.nextLine();
                authentication.register(username,password);
            }
            else if (choice == 2){
                System.out.println("Enter username: ");
                String username = scr.nextLine();
                System.out.println("Enter password: ");
                String password = scr.nextLine();
                authentication.register(username,password);
            }
            else {
                System.out.println("Goodbye!");
                break;
            }
        }
        scr.close();

    }
}