package org.launchcode.becflix.data;

import org.launchcode.becflix.models.Movie;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MovieData {

    private static final Map<Integer, Movie> movies = new HashMap<>();

    public static Collection<Movie> getAll(){
        return movies.values();
    }

    public static Movie getById(int id){
        return movies.get(id);
    }

    public static void  add(Movie movie){

        movies.put(movie.getMovieId(), movie);
    }

    public static void remove(int id){

        movies.remove(id);
    }
}
