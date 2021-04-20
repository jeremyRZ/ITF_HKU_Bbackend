package com.itf.backend.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String post;
    private String emailAddress;
    private String cellNumber;


}