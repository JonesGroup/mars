package com.jones.mars.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@ApiModel(value="新闻动态")
public class NewsParam {
    @ApiModelProperty(value="富文本内容",name="content")
    private String content;
    @NotBlank(message = "作者不能为空")
    @ApiModelProperty(value="作者",name="author")
    private String author;
    @NotBlank(message = "发布不能为空")
    @ApiModelProperty(value = "发布时间",name="publishTime")
    private Date publishTime;
    @NotBlank(message = "摘要不能为空")
    @ApiModelProperty(value = "摘要",name="summary")
    private String summary;
    @NotBlank(message = "标题不能为空")
    @ApiModelProperty(value = "标题",name="title")
    private String title;
    @NotBlank(message = "封面图片不能为空")
    @ApiModelProperty(value = "封面图片URL",name="imageUrl")
    private String imageUrl;
}

