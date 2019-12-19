package org.launchcode.spaday.models;

public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    private static int nextId = 1;
    public User() {
        this.id = this.nextId;
        this.nextId++;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return username;
    }
}
