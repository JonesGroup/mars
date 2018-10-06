package com.jones.mars.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ApiModel(value="项目参数")
public class ProjectParam {

    @ApiParam(hidden = true)
    private Integer id;
    @NotEmpty(message = "项目名称不能为空")
    @ApiModelProperty(value="项目名称",name="name")
    private String name;
    @ApiModelProperty(value="项目简介",name="detail")
    private String detail;
    @ApiModelProperty(value="项目图片",name="imageUrl")
    private String imageUrl;
    @NotNull(message = "模块ID不能为空")
    @ApiModelProperty(value="模块ID",name="blockId")
    private Integer blockId;
    @NotNull(message = "一级分类ID不能为空")
    @ApiModelProperty(value="一级分类ID",name="moduleId")
    private Integer moduleId;
    @NotNull(message = "二级分类ID不能为空")
    @ApiModelProperty(value="二级分类ID",name="classId")
    private Integer classId;
    @NotNull(message = "所属企业ID不能为空")
    @ApiModelProperty(value="所属企业ID",name="oriEnterpriseId")
    private Integer oriEnterpriseId;
    @ApiModelProperty(value="项目共建人ID列表",name="userIds")
    private List<Integer> userIds;

}

