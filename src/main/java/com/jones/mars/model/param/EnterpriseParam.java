package com.jones.mars.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@ApiModel(value="企业参数")
public class EnterpriseParam {
    @ApiParam(hidden = true)
    private Integer id;
    @NotBlank(message="企业名称不能为空")
    @ApiModelProperty(value="企业名称",name="name")
    private String name;
    @ApiModelProperty(value="企业简介",name="detail", allowEmptyValue=true)
    private String detail;
    @NotBlank(message="企业管理员不能为空")
    private Integer managerId;
}

