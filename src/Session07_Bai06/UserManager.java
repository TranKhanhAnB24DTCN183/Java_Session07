package Session07_Bai06;

import java.util.ArrayList;

public class UserManager {

    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static boolean checkLogin(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) &&
                    user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}

