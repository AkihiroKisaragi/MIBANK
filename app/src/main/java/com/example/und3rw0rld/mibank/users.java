package com.example.und3rw0rld.mibank;

public class users {

    private String username;
    private String balance;
    private String name;
    private String id;
    private String password;

    public users(String username, String password, String balance, String name, String id) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
