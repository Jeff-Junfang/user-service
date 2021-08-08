package com.eric.userservice.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Long id;
    private String userCode;
    private String userName;
    private Integer age;

}
