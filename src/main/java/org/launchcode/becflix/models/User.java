package org.launchcode.becflix.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    private int userId;
    private static int nextId = 1;

    @NotBlank(message = "You can't leave this field blank.")
    @Size(min = 3, max = 15, message = "Username must be between 3 to 15 Characters.")
    private String username;

    @Email(message = "Invalid Email.  Try again.")
    @NotBlank(message = "Must Enter a Valid Email!")
    private String email;

    @NotBlank(message = "You have to create a password.")
    @Size(min = 5, max = 15, message = "Password Must Be Between 5 to 15 Characters.")
    private String password;

    private String verifyPass;
    private String favoriteActor;
    private String favoriteActress;
    private String favoriteMovie;
    private String favoriteShow;


    public User(String username, String email, String password, String verifyPass, String favoriteActor, String favoriteActress, String favoriteMovie, String favoriteShow){
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPass = verifyPass;
        this.favoriteActor = favoriteActor;
        this.favoriteActress = favoriteActress;
        this.favoriteMovie = favoriteMovie;
        this.favoriteShow = favoriteShow;
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

    public String getFavoriteActor() {
        return favoriteActor;
    }

    public void setFavoriteActor(String favoriteActor) {
        this.favoriteActor = favoriteActor;
    }

    public String getFavoriteActress() {
        return favoriteActress;
    }

    public void setFavoriteActress(String favoriteActress) {
        this.favoriteActress = favoriteActress;
    }

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }

    public String getFavoriteShow() {
        return favoriteShow;
    }

    public void setFavoriteShow(String favoriteShow) {
        this.favoriteShow = favoriteShow;
    }
}
