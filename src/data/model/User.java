package data.model;

import data.model.enums.userRole;

public class User {
    private int userId;
    private String email;
    private String password;
    private userRole role;
    private boolean active;

    public User(){

    }
    public User(int userId, String email, String passwordHash, userRole role, boolean active) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.role = role;
        this.active = active;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public userRole getRole() {
        return role;
    }
    public void setRole(userRole role) {
        this.role = role;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
