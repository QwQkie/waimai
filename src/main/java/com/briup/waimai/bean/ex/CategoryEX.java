package com.briup.waimai.bean.ex;

import java.io.Serializable;

public class CategoryEX implements Serializable {
    private  Integer id;

    private String name;

    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "CategoryEX{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
