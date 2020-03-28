package org.launchcode.becflix.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value="addUser")
    public String displayAddUserForm(Model model){

        model.addAttribute("title", "Add Movie");
        return "addUser";
    }

}
