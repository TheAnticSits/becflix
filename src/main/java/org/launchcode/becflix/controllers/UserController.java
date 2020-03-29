package org.launchcode.becflix.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {


    @GetMapping
    public String index(Model model){
        model.addAttribute("title", "BecFlix");
        return "index";
    }


}
