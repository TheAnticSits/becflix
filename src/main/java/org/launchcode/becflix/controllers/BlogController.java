package org.launchcode.becflix.controllers;


import org.launchcode.becflix.data.BlogData;
import org.launchcode.becflix.models.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("blog")
public class BlogController {

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("blogs", BlogData.getAll());

        model.addAttribute("title", "BecFlix");
        return "blog/index";
    }

    @GetMapping("blog")
    public String displayNewBlog(Model model) {
        model.addAttribute("blogs", BlogData.getAll());
        model.addAttribute("title", "Blogs");
        return "blog/addBlog";
    }


    @GetMapping("addBlog")
    public String displayAddBlogForm(Model model) {
        model.addAttribute("title", "Add Blog");
        model.addAttribute(new Blog());

        return "blog/addBlog";
    }

    @PostMapping(value = "blog")
    public String processAddBlogForm(@ModelAttribute @Valid Blog newBlog, Model model) {
        model.addAttribute("title", "New Blog");
        BlogData.add(newBlog);
        return "redirect:";
    }




}
