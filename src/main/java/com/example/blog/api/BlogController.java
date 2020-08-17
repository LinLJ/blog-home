package com.example.blog.api;

import com.example.blog.common.ResultDTO;
import com.example.blog.domain.Blog;
import com.example.blog.dto.PageDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api")
public class BlogController {

    @ApiOperation("新增")
    @PostMapping("add")
    public ResultDTO add(Blog blog){
        return new ResultDTO();
    }
    @ApiOperation("更新")
    @PostMapping("update")
    public ResultDTO update(Blog blog){
        return new ResultDTO();
    }

    @ApiOperation("删除")
    @DeleteMapping("delectById")
    public ResultDTO delectById(@RequestParam String id){
        return new ResultDTO();
    }

    @ApiOperation("选择")
    @GetMapping("selectById")
    public ResultDTO selectById(@RequestParam String id){
        return new ResultDTO();
    }

    @ApiOperation("分页查询")
    @GetMapping("getArticleList")
    public ResultDTO page(@RequestParam String pageNum, @RequestParam String pageSize){

        List<Blog> blogs = new ArrayList<>();
        Blog blog = new Blog();
        blog.setId("123123");
        blog.setContent("### 这是第一篇博客");
        blog.setTitle("first blog");
        blog.setDescription("first blog description");
        blog.setStatus(1);
        blog.setCreateTime(new Date());
        blogs.add(blog);
        PageDTO pageDTO = new PageDTO();
        pageDTO.setList(blogs);
        pageDTO.setCount(1);
        return new ResultDTO(pageDTO);
    }
}
