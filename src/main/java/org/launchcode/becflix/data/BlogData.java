package org.launchcode.becflix.data;

import org.launchcode.becflix.models.Blog;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BlogData {

    private static final Map<Integer, Blog> blogs = new HashMap<>();

    public static Collection<Blog> getAll(){
        return blogs.values();
    }

    public static Blog getById(int id){
        return blogs.get(id);
    }

    public static void  add(Blog blog){

        blogs.put(blog.getBlogId(), blog);

    }

    public static void remove(int id){

        blogs.remove(id);
    }


}
