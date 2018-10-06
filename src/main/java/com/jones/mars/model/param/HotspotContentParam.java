package com.jones.mars.model.param;

import com.jones.mars.model.constant.HotspotContentType;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class HotspotContentParam {
    @NotNull
    @ApiModelProperty(value="类型",name="type")
    private HotspotContentType type;
    @ApiModelProperty(value="额外信息",name="extra")
    private String extra;
    @ApiModelProperty(value="内容",name="content")
    private String content;
    @ApiModelProperty(value="标题",name="title")
    private String title;
    @NotNull
    @ApiModelProperty(value="热点ID",name="userIds")
    private Integer hotspotId;
    @ApiParam(hidden = true)
    private Integer id;
}

