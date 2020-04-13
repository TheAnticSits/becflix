
package org.launchcode.becflix.controllers;

import org.launchcode.becflix.models.Movie;
import org.launchcode.becflix.data.MovieData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping(value="movie")
public class MovieController {

    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("movies", MovieData.getAll());

        model.addAttribute("title", "BecFlix");
        return "movie/index";
    }

    @GetMapping("addMovie")
    public String displayAddMovieForm(Model model){

        model.addAttribute("title", "Add Movie");
        model.addAttribute(new Movie());
        return "movie/addMovie";
    }

    @PostMapping(value="addMovie")
    public String processAddMovieForm(@ModelAttribute @Valid Movie newMovie, Errors errors, Model model){
        if (errors.hasErrors()) {
            model.addAttribute("title", "New Movie");

            return "movie/addMovie";
        } else {

            MovieData.add(newMovie);
            return "redirect:";
        }
    }

    @GetMapping("removeMovie")
    public String displayRemoveMovieForm(Model model){
        model.addAttribute("movies", MovieData.getAll());
        model.addAttribute("title", "Remove Movie(s)");
        return "movie/removeMovie";
    }

    @PostMapping(value = "removeMovie")
    public String processRemoveMovieForm(@RequestParam (required = false) int[] movieIds){
        if(movieIds != null){
            for (int id : movieIds){
                MovieData.remove(id);
            }
        }
        return "redirect:";
    }
}
