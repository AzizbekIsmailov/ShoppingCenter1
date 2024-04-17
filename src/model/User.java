package model;

import enumerators.UserRole;

public class User extends BaseModel{


    private String username;
    private String password;
    private Integer balance;
    private UserRole role;

    public User(String username, String password, Integer balance, UserRole role) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.role = role;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
