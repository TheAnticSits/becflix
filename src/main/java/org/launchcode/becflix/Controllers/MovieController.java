package org.launchcode.becflix.Controllers;


import org.launchcode.becflix.Models.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping(value="movie")
public class MovieController {

    static ArrayList<Movie> movies = new ArrayList<>();

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
    public String processAddMovieForm(@RequestParam String movieName, @RequestParam int year, @RequestParam String genre, @RequestParam String director, @RequestParam String franchise, @RequestParam String rating, @RequestParam String importance){

        Movie newMovie = new Movie(movieName, year, genre, director, franchise, rating, importance);

        movies.add(newMovie);
        return "redirect:";
    }
}
