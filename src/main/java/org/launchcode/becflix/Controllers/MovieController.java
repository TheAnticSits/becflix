package org.launchcode.becflix.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //spring recognizes it as a controller
public class MovieController {

    //method for the index
    //value specifies the route to which requests should be mapped to this handler
    //the ResponseBody annotation is used to bind the HTTP request/response body with a domain object in method parameter or return type
    @RequestMapping(value = "")
    @ResponseBody
    public String index(){

        return "The Start of the Movies.";

    }
}
