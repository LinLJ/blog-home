package com.example.blog.service;

import com.example.blog.domain.Blog;

import java.util.List;

public interface IBlogService {

    public Blog add(Blog blog);

    public Blog update(Blog blog);

    public Blog selectById(String id);

    public List<Blog> selectByBlogCategoryId(String id);
}
