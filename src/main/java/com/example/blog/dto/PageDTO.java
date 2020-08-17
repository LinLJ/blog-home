package com.example.blog.dto;

import lombok.Data;

import java.util.List;

@Data
public class PageDTO<DTO extends BaseDTO> {

    private int page;
    private int pageSize;
    private DTO filters;
    private int count;
    private List list;
}
