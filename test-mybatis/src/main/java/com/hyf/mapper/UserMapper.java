package com.hyf.mapper;

import com.hyf.pojo.User;

/**
 * @author baB_hyf
 * @date 2020/05/16
 */
public interface UserMapper {
    User selectUserById(Integer id);
}
