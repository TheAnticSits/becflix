
package org.launchcode.becflix.Controllers;

import org.launchcode.becflix.Models.Movie;
import org.launchcode.becflix.Models.MovieData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;


@Controller
@RequestMapping(value="movie")
public class MovieController {

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("movies", MovieData.getAll());

        model.addAttribute("title", "BecFlix");
        return "movie/index";
    }

    @RequestMapping(value="addMovie", method = RequestMethod.GET)
    public String displayAddMovieForm(Model model){

        model.addAttribute("title", "Add Movie");
        return "movie/addMovie";
    }

    @RequestMapping(value="addMovie", method = RequestMethod.POST)
    public String processAddMovieForm(@ModelAttribute @Valid Movie newMovie, Errors errors, Model model){

        if(errors.hasErrors()){
            model.addAttribute("title", "Add Movie");
            return "movie/addMovie";
        }

        MovieData.add(newMovie);
        return "redirect:";
    }

    @RequestMapping(value = "removeMovie", method = RequestMethod.GET)
    public String displayRemoveMovieForm(Model model){
        model.addAttribute("movies", MovieData.getAll());
        model.addAttribute("title", "Remove Movie(s)");
        return "movie/removeMovie";
    }

    @RequestMapping(value = "removeMovie", method = RequestMethod.POST)
    public String processRemoveMovieForm(@RequestParam int[] movieIds){

        for(int movieId : movieIds){

            MovieData.remove(movieId);
        }
        return "redirect:";
    }
}
