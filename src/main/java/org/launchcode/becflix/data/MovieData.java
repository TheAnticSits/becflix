package org.launchcode.becflix.data;

import org.launchcode.becflix.models.Movie;

import java.util.ArrayList;

public class MovieData {

    static ArrayList<Movie> movies = new ArrayList<>();

    //need to getAll
    public static ArrayList<Movie> getAll() {
        return movies;
    }

    //need add
    public static void add(Movie newMovie) {
        movies.add(newMovie);
    }
    //need remove

    public static void remove(int id) {
        Movie movieToRemove = getById(id);
        movies.remove(movieToRemove);
    }

    //get by Id
    public static Movie getById(int id) {
        Movie theMovie = null;

        for (Movie candidateMovie : movies) {
            if (candidateMovie.getMovieId() == id) {
                theMovie = candidateMovie;
            }
        }
        return theMovie;
    }
}
