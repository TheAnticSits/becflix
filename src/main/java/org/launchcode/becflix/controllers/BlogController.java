package org.launchcode.becflix.controllers;


import org.launchcode.becflix.data.BlogData;
import org.launchcode.becflix.data.UserData;
import org.launchcode.becflix.models.Blog;
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

    @GetMapping
    public String displayNewUser(Model model) {
        model.addAttribute("blogs", BlogData.getAll());
        model.addAttribute("title", "Blogs");
        return "user/index";
    }


    @GetMapping("addBlog")
    public String displayAddBlogForm(Model model) {
        model.addAttribute("title", "Add Blog");
        model.addAttribute(new Blog());
        return "blog/addBlog";
    }

    @PostMapping(value = "addBlog")
    public String processAddBlogForm(@ModelAttribute @Valid Blog newBlog, Model model) {
        model.addAttribute("title", "New Blog");

        return "blog/addBlog";
    }




}
