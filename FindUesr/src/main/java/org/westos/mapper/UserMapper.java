package org.westos.mapper;

import org.apache.ibatis.annotations.Select;
import org.westos.entity.User;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();
}
