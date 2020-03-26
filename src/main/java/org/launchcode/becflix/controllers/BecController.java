
package org.launchcode.becflix.controllers;

import org.launchcode.becflix.data.MovieData;
import org.launchcode.becflix.models.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="")
public class BecController {

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("movies", MovieData.getAll());

        model.addAttribute("title", "BecFlix");
        return "/becflix/homepage";
    }

}
