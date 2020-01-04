package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.User;


import java.util.List;

public interface UserEXMapper {
    public List<User> search(String word);
}
