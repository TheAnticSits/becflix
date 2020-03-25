
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

    @RequestMapping(value = "removeShow", method = RequestMethod.GET)
    public String displayRemoveShowForm(Model model){
        model.addAttribute("shows", ShowData.getAll());
        model.addAttribute("title", "Remove show(s)");
        return "show/removeShow";
    }

    @RequestMapping(value = "removeShow", method = RequestMethod.POST)
    public String processRemoveShowForm(@RequestParam int[] showIds){

        for(int showId : showIds){

            ShowData.remove(showId);
        }
        return "redirect:";
    }

}

