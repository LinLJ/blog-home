package com.example.blog.service;

import com.example.blog.domain.Blog;
import com.example.blog.domain.BlogRepository;
import com.example.blog.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog add(Blog blog) {
        blog.setId(UUIDUtils.getUUID32());
        return blogRepository.save(blog);
    }

    @Override
    public Blog update(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog selectById(String id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public List<Blog> selectByBlogCategoryId(String id) {
        return blogRepository.findByBlogCategoryId(id);
    }
}
