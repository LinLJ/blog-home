package com.example.blog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, String>, JpaSpecificationExecutor<Blog> {

    List<Blog> findByBlogCategoryId(String blogCategoryId);

}
