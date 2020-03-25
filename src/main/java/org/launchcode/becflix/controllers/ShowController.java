
package org.launchcode.becflix.controllers;


import org.launchcode.becflix.data.ShowData;
import org.launchcode.becflix.models.Show;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="show")
public class ShowController {

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("shows", ShowData.getAll());

        model.addAttribute("title", "BecFlix");
        return "show/index";
    }

    @RequestMapping(value="addShow", method = RequestMethod.GET)
    public String displayAddShowForm(Model model){

        model.addAttribute("title", "Add Show");
        return "show/addShow";
    }

    @RequestMapping(value="addShow", method = RequestMethod.POST)
    public String processAddShowForm(@RequestParam int showId, @RequestParam String showName, @RequestParam int year, @RequestParam String genre, @RequestParam String importance){
        String noEntry = "No Entry";
        String noInt = "";


        Show newShow = new Show(showName, year, genre,  importance);
// this may be totally screwed up
        ShowData.getById(showId);
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

