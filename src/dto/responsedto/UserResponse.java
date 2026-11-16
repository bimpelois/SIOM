package dto.responsedto;

public class UserResponse {
    private int userId;
    private String email;
    private String role;
    private boolean active;

    public UserResponse() {
    }

    public UserResponse(int userId, String email, String role, boolean active) {
        this.userId = userId;
        this.email = email;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
