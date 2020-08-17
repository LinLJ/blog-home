package com.example.blog.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDTO {
    private String id;
    private Date createTime;
    private Date updateTime;
    private int flag;
}
