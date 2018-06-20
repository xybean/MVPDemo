package com.xybean.mvpdemo.model;

/**
 * Author @xybean on 2018/6/20.
 */
public class File {
    private String name;
    private long id;

    public File(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
