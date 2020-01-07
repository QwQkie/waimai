package com.briup.waimai.bean.ex;

import com.briup.waimai.bean.Menu;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class OderEX {
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;

    private Double price;

    private String state;

    private String  username;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String  address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
