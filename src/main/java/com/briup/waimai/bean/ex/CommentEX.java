package com.briup.waimai.bean.ex;

public class CommentEX {
    private String Cstate;
    private String name;
    private String description;
    private Double price;
    private String code;

    public String getCstate() {
        return Cstate;
    }

    public void setCstate(String cstate) {
        Cstate = cstate;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
