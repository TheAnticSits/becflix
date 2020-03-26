
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
        return "movie/index";
    }

    @RequestMapping(value="addMovie", method = RequestMethod.GET)
    public String displayAddMovieForm(Model model){

        model.addAttribute("title", "Add Movie");
        return "movie/addMovie";
    }

    @RequestMapping(value="addMovie", method = RequestMethod.POST)
    public String processAddMovieForm(@RequestParam String movieName, @RequestParam int year, @RequestParam String genre, @RequestParam String director, @RequestParam String franchise, @RequestParam String rating, @RequestParam String importance){
        String noEntry = "No Entry";
        String noInt = "";
        if(director == null){
            director = noEntry;
        }
        if(franchise.equals(null)) franchise = noEntry;
        if(noInt.equals(year)){
            year = 0;
        }

        Movie newMovie = new Movie(movieName, year, genre, director, franchise, rating, importance);

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
