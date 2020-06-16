package org.launchcode.becflix.models;

public class Blog {

    private int blogId;
    private String blogTitle;
    private String blog;

    private static int nextId = 1;

    public Blog (String blogTitle, String blog){

        this.blogTitle = blogTitle;
        this.blog = blog;

    }

    public Blog() {
        blogId = nextId;
        nextId++;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
