package com.example.blog.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface BlogCategoryRepository extends JpaRepository<BlogCategory, String>, JpaSpecificationExecutor<BlogCategory> {
    List<BlogCategory> findByparentCategoryId(String parentCategoryId);
}
