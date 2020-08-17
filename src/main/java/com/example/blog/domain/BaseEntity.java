package com.example.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    private String id;
    private Date createTime;
    private Date updateTime;
    private int flag;
}
