package org.launchcode.becflix.models;

public class Blog {

    private int blogId;
    private String blogTitle;
    private String blogBody;

    private static int nextId = 1;

    public Blog (String blogTitle, String blogBody){

        this.blogTitle = blogTitle;
        this.blogBody = blogBody;

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

    public String getBlogBody() {
        return blogBody;
    }

    public void setBlogBody(String blogBody) {
        this.blogBody = blogBody;
    }

    public int getBlogId() {
        return blogId;
    }
}
