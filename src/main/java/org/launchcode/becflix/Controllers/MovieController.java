package org.launchcode.becflix.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //spring recognizes it as a controller
@RequestMapping(value="movie") //establishes a base request path for every method within the controller.
public class MovieController {

    //method for the index
    //value specifies the route to which requests should be mapped to this handler
    //the ResponseBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type
    //@ResponseBody allows the controller method to return text directly from the controller method(the handler) removed from here.
    //request path is now /movie
    @RequestMapping(value = "")
    public String index(Model model){
        //adding an attribute to the model in a key/value pair.
        model.addAttribute("title", "My BecFlix");
        return "movie/index";

    }
}
