package com.example.blog.service;

import com.example.blog.domain.Blog;
import com.example.blog.domain.BlogCategory;

import java.util.List;

public interface IBlogCategoryService {

    public BlogCategory add(BlogCategory blogCategory);

    public BlogCategory update(BlogCategory blogCategory);

    public List<BlogCategory> selectByParentId(String id);

}
