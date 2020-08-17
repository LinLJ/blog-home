package com.example.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
@Data
public class UserInfo extends BaseEntity{

    private String userName;
    private String avatar;
    private String email;
    private String password;
    private int status;
}
