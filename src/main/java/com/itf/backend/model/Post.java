package com.itf.backend.model;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private Integer id;
    private User author;
    private Integer authorId;    // 作者的 id
    private String title;       // 文章标题
    private String content;     // 文章内容
    private Date createTime;

}
