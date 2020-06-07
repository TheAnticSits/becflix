package org.launchcode.becflix.controllers;


import org.launchcode.becflix.data.UserData;
import org.launchcode.becflix.models.User;
import org.launchcode.becflix.models.enums.GenreType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String displayNewUser(Model model) {
        model.addAttribute("users", UserData.getAll());
        model.addAttribute("title", "BecFlix");
        return "user/index";
    }


    @GetMapping("addUser")
    public String displayAddUserForm(Model model) {
        model.addAttribute("title", "Add User");
        model.addAttribute(new User());
        model.addAttribute("genres", GenreType.values());
        return "user/addUser";
    }

    @PostMapping(value = "addUser")
    public String processAddUserForm(@ModelAttribute @Valid User newUser, Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("title", "New User");

            return "user/addUser";
        } else {
            if (newUser.getPassword().equals((newUser.getVerifyPass()))){
                UserData.add(newUser);
                return "redirect:";
            }
            else{
                return "user/addUser";
            }

        }
    }
    @GetMapping("login")
    public String displayLoginForm(Model model){
        model.addAttribute("title", "Login");
        return "user/login";
    }

    @PostMapping(value="login")
    public String processLoginForm(){
//        TODO Validate and return this data
        return "user/userProfile";
    }

    @GetMapping(value="logout")
    public String displayLogoutForm(@ModelAttribute User newUser){
        UserData.add(newUser);
        return "redirect:";
    }

    @GetMapping("userProfile")
    public String displayUserProfileForm(Model model){
        return "user/userProfile";
    }

    @GetMapping("editUserProfile")
    public String displayEditUserProfileForm(Model model){

        model.addAttribute("title", "User Profile");
        model.addAttribute("genres", GenreType.values());

        return"user/editUserProfile";
    }

    @PostMapping("editUserProfile")
    public String processEditUserProfileForm(@ModelAttribute @Valid User newUser, Model model){
        UserData.add(newUser);
        return "user/index";
    }

    @GetMapping("blog")
    public String displayUserBlog(){
        return "user/blog";
    }

    @PostMapping("blog")
    public String processUserBlog(){

        return "redirect:";
    }

}
