/*
package com.example.blog.common;

import com.example.blog.dto.BaseDTO;
import com.example.blog.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public abstract class BaseController <S extends IBaseService,DTO extends BaseDTO>{

    @Autowired
    protected S iBaseService;

    public BaseController() {
    }

    @PostMapping({"/save"})
    public ResultDTO<DTO> save(@RequestBody DTO dto){
        DTO resultDTO = this.iBaseService.save(dto);
        return new ResultDTO(resultDTO);
    }

    @PostMapping({"/batchSave"})
    public ResultDTO batchSave(@RequestBody List<DTO> dtos) {
        this.iBaseService.batchSave(dtos);
        return new ResultDTO();
    }

    @PutMapping({"/update"})
    public ResultDTO<String> update(@RequestBody DTO dto) {
        DTO resultDTO = this.iBaseService.update(dto);
        return new ResultDTO(resultDTO);
    }

    @GetMapping({"/selectById"})
    public ResultDTO selectById(@RequestParam String id)  {
        List<DTO> byId = this.iBaseService.findByIds(Arrays.asList(id));
        return new ResultDTO(byId);
    }

    @PostMapping({"/selectByPage"})
    public ResultDTO<PageDTO<DTO>> selectByPage(@RequestBody PageDTO<DTO> pageDTO) {
        pageDTO = this.iBaseService.getPage(pageDTO);
        return new ResultDTO(pageDTO);
    }
}
*/
