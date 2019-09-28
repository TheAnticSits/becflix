package org.launchcode.becflix.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


@Controller //spring recognizes it as a controller
@RequestMapping(value="movie") //establishes a base request path for every method within the controller.
public class MovieController {

    ArrayList<String> movies = new ArrayList<>();
    //method for the index
    //value specifies the route to which requests should be mapped to this handler
    //the ResponseBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type
    //@ResponseBody allows the controller method to return text directly from the controller method(the handler) removed from here.
    //request path is now /movie
    @RequestMapping(value = "")
    public String index(Model model){

        //creating an ArrayList called movies to pass into the view to test the view out.
        //ArrayList<String> movies = new ArrayList<>();
        //adding a list of movies to the movies ArrayList
/*        movies.add("Moving");
        movies.add("Fletch");
        movies.add("The Three Amigos");*/
        //adding the object movies, the ArrayList, to the view using the name movies
        model.addAttribute("movies", movies);

        //adding an attribute to the model in a key/value pair.
        //the model is what passes data into the view.
        model.addAttribute("title", "My BecFlix");
        return "movie/index";
    }

    //adding controller method to display the add for more movies.
    @RequestMapping(value="addMovie", method = RequestMethod.GET)
    public String displayAddMovieForm(Model model){
        //adding the title and sending the controller to the template addMovie
        model.addAttribute("title", "Add Movie");
        return "movie/addMovie";
    }
    //common pattern for displaying and submitting the form to have them both to the same url and the get request being
    //the display and the POST request being the processing.
    //@RequestParam says that spring should look for a parameter with the same name as the method attribute movieName
    @RequestMapping(value="addMovie", method = RequestMethod.POST)
    public String processAddMovieForm(@RequestParam String movieName){
        //add the movie from the form
        movies.add(movieName);
        //Redirect to /movie the path that's empty. relative to any requestmapping configured on controller
        return "redirect:";
    }
}
