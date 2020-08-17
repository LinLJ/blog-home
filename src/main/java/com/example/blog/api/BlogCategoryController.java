package com.example.blog.api;

import com.example.blog.common.ResultDTO;
import com.example.blog.domain.Blog;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("blogCategory")
public class BlogCategoryController {
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

}
