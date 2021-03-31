package com.itf.backend.mapper;

import com.itf.backend.model.Post;

public interface PostMapper {
    int add(Post post);

    Post findOne(Post param);
}