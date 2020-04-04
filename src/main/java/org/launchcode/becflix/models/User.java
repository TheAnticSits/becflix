package org.launchcode.becflix.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    private int userId;
    private static int nextId = 1;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Size(min = 5, max = 15, message = "Password Must Be Between 5 to 15 Characters.")
    private String password;
    
    private String verifyPass;


    public User(String username, String email, String password, String verifyPass){
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPass = verifyPass;
    }

    public User(){
        userId = nextId;
        nextId++;
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

    public String getVerifyPass() {
        return verifyPass;
    }

    public void setVerifyPass(String verifyPass) {
        this.verifyPass = verifyPass;
    }

    public int getUserId() {
        return userId;
    }
}
