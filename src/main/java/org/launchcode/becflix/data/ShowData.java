
package org.launchcode.becflix.data;

import org.launchcode.becflix.models.Show;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShowData {

    private static final Map<Integer, Show> shows = new HashMap<>();

    public static Collection<Show> getAll(){
        return shows.values();
    }

    public static Show getById(int id){
        return shows.get(id);
    }

    private static void  add(Show show){
        shows.put(show.getShowId(), show);
    }

    public static void remove(int id){
        shows.remove(id);
    }
}

