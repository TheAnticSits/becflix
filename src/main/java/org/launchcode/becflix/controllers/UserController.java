package org.launchcode.becflix.controllers;

import org.launchcode.becflix.data.UserData;
import org.launchcode.becflix.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "user/addUser";
    }

    @PostMapping(value = "addUser")
    public String processAddUserForm(@ModelAttribute User newUser) {
        if (newUser.getUsername().isEmpty() || (newUser.getUsername().length() < 5) || (newUser.getUsername().length() > 15)) {
            return "user/addUser";
        } else if (newUser.getPassword().isEmpty() || (newUser.getPassword().length() < 5 || (newUser.getPassword().length() > 15))) {
            return "user/addUser";
        } else if (newUser.getVerifyPass().isEmpty()) {
            return "user/addUser";
        } else if (newUser.getEmail().isEmpty()) {
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
        return "user/login";
    }

    @GetMapping(value="logout")
    public String displayLogoutForm(@ModelAttribute User newUser){
        UserData.add(newUser);
        return "redirect:";
    }

}
