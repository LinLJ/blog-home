package com.example.blog.api;

import com.example.blog.common.ResultDTO;
import com.example.blog.domain.UserInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @ApiOperation("新增")
    @PostMapping("/add")
    public ResultDTO add(UserInfo userInfo){
        return new ResultDTO();
    }
    @ApiOperation("选择")
    @GetMapping("selectById")
    public ResultDTO selectById(@RequestParam String id){
        return new ResultDTO();
    }
}
