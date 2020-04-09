package org.launchcode.becflix.data;

import org.launchcode.becflix.models.Movie;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MovieData {

    private static final Map<Integer, Movie> movies = new HashMap<>();

    public static Collection<Movie> getAll(){
        return movies.values();
    }

/*
    //need add
    public static void add(Movie newMovie) {
        movies.add(newMovie);
    }
    //need remove
*/

    public static void remove(int id) {
        Movie movieToRemove = getById(id);
        movies.remove(movieToRemove);
    }

    //get by Id
    public static Movie getById(int id) {
        Movie theMovie = null;

 /*       for (Movie candidateMovie : movies) {
            if (candidateMovie.getMovieId() == id) {
                theMovie = candidateMovie;
            }
        }*/
        return theMovie;
    }
}
