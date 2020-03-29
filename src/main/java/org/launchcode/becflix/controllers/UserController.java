package org.launchcode.becflix.controllers;

import org.launchcode.becflix.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {


    @GetMapping("addUser")
    public String displayAddUserForm(Model model){
        return "user/addUser";
    }

    @PostMapping(value="addUser")
    public String processAddUserForm(@ModelAttribute User newUser){
//        UserData.add(newUser);
        return "redirect:";
    }


}
