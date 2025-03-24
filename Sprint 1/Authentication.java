import java.util.HashMap;

public class Authentication {
    private HashMap<String, User> users;

    public Authentication(){
        this.users = new HashMap<>();
    }

    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already taken.");
            return false;
        }
        users.put(username, new User(username,password));
        System.out.println("User registerd successfully!");
        return true;
    }

    public boolean login(String username, String passowrd) {
        if (!users.containsKey(username)){
            System.out.println("User not found");
            return false;
        }
        User user = users.get(username);
        if (user.checkPassword(passowrd)) {
            System.out.println("login successful!");
            return true;
        }
        else {
            System.out.println("Incorrect password.");
            return false;
        }
    }

}
