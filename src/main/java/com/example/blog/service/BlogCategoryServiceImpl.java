package com.example.blog.service;

import com.example.blog.domain.Blog;
import com.example.blog.domain.BlogCategory;
import com.example.blog.domain.BlogCategoryRepository;
import com.example.blog.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogCategoryServiceImpl implements IBlogCategoryService {

    @Autowired
    private BlogCategoryRepository blogCategoryRepository;

    @Override
    public BlogCategory add(BlogCategory blogCategory) {
        blogCategory.setId(UUIDUtils.getUUID32());
        return blogCategoryRepository.save(blogCategory);
    }

    @Override
    public BlogCategory update(BlogCategory blogCategory) {
        return blogCategoryRepository.save(blogCategory);
    }

    @Override
    public List<BlogCategory> selectByParentId(String id) {
        return blogCategoryRepository.findByparentCategoryId(id);
    }

}
