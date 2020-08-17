package com.example.blog.domain;

import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="blog_category")
@Data
public class BlogCategory extends BaseEntity{
    private String category;
    private String blogId;
    private String parentCategoryId;
}
