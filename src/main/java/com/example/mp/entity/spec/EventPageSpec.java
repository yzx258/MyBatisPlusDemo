package com.example.mp.entity.spec;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.entity.Event;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yucw
 * @date 2020/8/25 11:27
 */
@Data
public class EventPageSpec {

    @ApiModelProperty("关键词")
    private String keyword;

    @ApiModelProperty("分页参数")
    private Page page;
}
