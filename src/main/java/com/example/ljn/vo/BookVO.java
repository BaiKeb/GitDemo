package com.example.ljn.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BookVO implements Serializable {

    private Long id;
    private String title;
    private String publish;
    private String authors;

    private Date createTime;

    private Date updateTime;

}
