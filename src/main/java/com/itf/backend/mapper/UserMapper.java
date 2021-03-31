package com.itf.backend.mapper;

import com.itf.backend.model.User;

public interface UserMapper {
    int add(User user);
    User findOne(User user);
}
