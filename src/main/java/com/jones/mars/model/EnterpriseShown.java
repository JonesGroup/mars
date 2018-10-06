package com.jones.mars.model;

import lombok.Data;

import java.util.Date;

@Data
public class EnterpriseShown {
    private Integer id;
    private String name;
    private String imageUrl;
    private Integer enterpriseId;
    private Date updateTime;
    private Date createTime;

}

