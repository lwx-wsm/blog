package com.scs.web.blog.entity;

import lombok.Data;

/**
 * @ClassName Book
 * @Description TODO
 * @Author mq_xu
 * @Date 2019/11/27
 **/
@Data
public class Book {
    private Integer id;
    private String bookName;
    private String cover;
    private Double price;
}
