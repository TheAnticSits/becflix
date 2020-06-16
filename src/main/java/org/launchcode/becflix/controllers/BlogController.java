package org.launchcode.becflix.controllers;


import org.launchcode.becflix.data.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("blog")
public class BlogController {

   /* @GetMapping
    public String displayNewUser(Model model) {
        model.addAttribute("blogs", BlogData.getAll());
        model.addAttribute("title", "Blogs");
        return "user/index";
    }


    @GetMapping("addUser")
    public String displayAddUserForm(Model model) {
        model.addAttribute("title", "Add User");
        model.addAttribute(new Blog());
        return "user/addUser";
    }

    @PostMapping(value = "addUser")
    public String processAddUserForm(@ModelAttribute @Valid Blog newBlog, Errors errors, Model model) {
        if(errors.hasErrors()){
            model.addAttribute("title", "New User");

            return "user/addUser";
        } else {
            if (newUser.getPassword().equals((newUser.getVerifyPass()))){
                UserData.add(newBlog);
                return "redirect:";
            }
            else{
                return "user/addUser";
            }

        }
    }*/

}
