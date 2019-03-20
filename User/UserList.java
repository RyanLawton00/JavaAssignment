package User;

import java.util.ArrayList;
import User.User;

public class UserList {
    private static ArrayList<User> users = new ArrayList<User>();

    public static void addUser (User us) {
        users.add(us);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }


    }




