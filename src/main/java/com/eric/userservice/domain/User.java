package com.eric.userservice.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author wangqiang167
 */
@Data
@Document
public class User implements Serializable {

    private Long id;
    private String userCode;
    private String userName;
    private Integer age;

}
