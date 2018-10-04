package com.jones.mars.model.query;

import com.jones.mars.model.constant.CommonConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
@ApiModel(value="首页项目查询参数")
public class HomeProjectQuery extends Query {
    @ApiModelProperty(value="模块ID",name="blockId")
    private Integer blockId;
    @ApiModelProperty(value="企业ID",name="enterpriseId")
    private Integer enterpriseId;
    @ApiModelProperty(value="来源企业ID",name="oriEnterpriseId")
    private Integer oriEnterpriseId;
    @ApiParam(hidden = true)
    private Integer plateform_flg = CommonConstant.PLATEFROM;
    @ApiParam(hidden = true)
    private String name;
    @ApiParam(hidden = true)
    private Integer moduleId;
    @ApiParam(hidden = true)
    private Integer classId;
}
