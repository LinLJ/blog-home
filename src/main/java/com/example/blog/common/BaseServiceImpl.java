package com.example.blog.common;

import com.example.blog.dto.BaseDTO;
import com.example.blog.dto.PageDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BaseServiceImpl<DTO extends BaseDTO> implements IBaseService<DTO> {
    @Override
    public boolean batchSave(List<DTO> entityList) {
        return false;
    }

    @Override
    public List<DTO> findByIds(List<String> ids) {
        return null;
    }

    @Override
    public DTO update(DTO dto) {
        return null;
    }

    @Override
    public DTO save(DTO dto) {
        return null;
    }

    @Override
    public PageDTO<DTO> getPage(PageDTO<DTO> pageDTO) {
        return null;
    }
}
