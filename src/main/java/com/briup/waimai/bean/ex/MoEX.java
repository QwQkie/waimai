package com.briup.waimai.bean.ex;

import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.Oder;

import java.util.List;

public class MoEX {
    private Integer id;
    private List<Menu> menus;
    private List<Oder> oders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Oder> getOders() {
        return oders;
    }

    public void setOders(List<Oder> oders) {
        this.oders = oders;
    }
}
