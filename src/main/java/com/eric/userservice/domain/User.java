package com.eric.userservice.domain;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String userCode;
    private String userName;
    private Integer age;

}
