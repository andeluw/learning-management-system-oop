package model;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private String role;

    public Admin(String name, String email, String password, String role) {
        super(name, email, password);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void createUser(User user) {
        System.out.println("Created user: " + user.name);
    }

    public void deleteUser(User user) {
        System.out.println("Deleted user: " + user.name);
    }

    public List<User> manageUsers() {
        return new ArrayList<>();
    }

    @Override
    public boolean login() {
        System.out.println("Admin " + name + " logged in.");
        return true;
    }
}
