
package org.launchcode.becflix.controllers;

import org.launchcode.becflix.data.ShowData;
import org.launchcode.becflix.models.Show;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("show")
public class ShowController {

    @GetMapping
    public String displayAllShows(Model model){

        model.addAttribute("shows", ShowData.getAll());
        model.addAttribute("title", "BecFlix");
        return "show/index";
    }

    @GetMapping("addShow")
    public String displayAddShowForm(Model model){

        model.addAttribute("title", "Add Show");
        return "show/addShow";
    }

    @GetMapping("addShow")
    public String processAddShowForm(@ModelAttribute Show newShow){
        ShowData.add(newShow);
        return "redirect:";
    }

    @GetMapping("removeShow")
    public String displayRemoveShowForm(Model model){
        model.addAttribute("shows", ShowData.getAll());
        model.addAttribute("title", "Remove show(s)");
        return "show/removeShow";
    }

    @PostMapping(value = "removeShow")
    public String processRemoveShowForm(@RequestParam (required = false) int[] showIds){

        if(showIds != null){
            for (int id : showIds){
                ShowData.remove(id);
            }
        }
        return "redirect:";
    }

}

