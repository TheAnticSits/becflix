
package org.launchcode.becflix.Controllers;

import org.launchcode.becflix.Models.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;


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

        movies.add(newMovie);
        return "redirect:";
    }

    @RequestMapping(value = "removeMovie", method = RequestMethod.GET)
    public String displayRemoveMovieForm(Model model){
        model.addAttribute("movies", movies);
        model.addAttribute("title", "Remove Movie(s)");
        return "movie/removeMovie";
    }

    @RequestMapping(value = "removeMovie", method = RequestMethod.POST)
    public String processRemoveMovieForm(@RequestParam ArrayList<String> movie){

        for(String aMovie : movie){
            System.out.println(aMovie);
            movies.remove(aMovie);
        }
        return "redirect:";
    }
}
