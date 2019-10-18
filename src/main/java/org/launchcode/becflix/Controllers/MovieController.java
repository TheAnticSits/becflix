package org.launchcode.becflix.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import java.util.HashMap;


@Controller
@RequestMapping(value="movie")
public class MovieController {

    HashMap<String, String> movies = new HashMap<>();

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("movies", movies);

        model.addAttribute("title", "BecFlix");
        return "movie/index";
    }

    @RequestMapping(value="addMovie", method = RequestMethod.GET)
    public String displayAddMovieForm(Model model){

        model.addAttribute("title", "Add Movie");
        return "movie/addMovie";
    }

    @RequestMapping(value="addMovie", method = RequestMethod.POST)
    public String processAddMovieForm(@RequestParam String movieName, @RequestParam String year){

        movies.put(movieName, year);

        return "redirect:";
    }
}
