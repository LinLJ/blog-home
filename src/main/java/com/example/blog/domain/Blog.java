package com.example.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="blog")
@Data
public class Blog extends BaseEntity{
    private String userId;
    private String title;
    private String description;
    private String content;
    private String blogCategoryId;
    private int status;

}
