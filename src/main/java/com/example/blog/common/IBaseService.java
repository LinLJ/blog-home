package com.example.blog.common;

import com.example.blog.dto.BaseDTO;
import com.example.blog.dto.PageDTO;

import java.util.List;


public interface IBaseService<DTO extends BaseDTO> {

    boolean batchSave(List<DTO> entityList);

    List<DTO> findByIds(List<String> ids);

    DTO update(DTO dto);

    DTO save(DTO dto);

    PageDTO<DTO> getPage(final PageDTO<DTO> pageDTO);

}
