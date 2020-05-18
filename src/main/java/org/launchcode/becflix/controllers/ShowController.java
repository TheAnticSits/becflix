
package org.launchcode.becflix.controllers;

import org.launchcode.becflix.data.ShowData;
import org.launchcode.becflix.models.Show;
import org.launchcode.becflix.models.enums.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
        model.addAttribute(new Show());
        model.addAttribute("genres", GenreType.values());
        model.addAttribute("ratings", Rating.values());
        model.addAttribute("importances", Importance.values());
        model.addAttribute("types", Type.values());
        model.addAttribute("months", Month.values());
        model.addAttribute("dayOfMonths", DayOfMonth.values());
        model.addAttribute("years", Year.values());
        return "show/addShow";
    }

    @PostMapping(value="addShow")
    public String processAddShowForm(@ModelAttribute @Valid Show newShow, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "New Show");

            return "show/addShow";
        } else {

            ShowData.add(newShow);
            return "redirect:";
        }
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

