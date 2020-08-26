package com.example.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lqh
 * @since 2020-08-25
 */
@Data
public class Report extends Model<Report> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一ID
     */
	private String id;
    /**
     * 年份
     */
	private String year;
    /**
     * 月份
     */
	private String month;
    /**
     * 竞猜类型：0：黑；1：红
     */
	@TableField("quiz_type")
	private Integer quizType;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private String createTime;
    /**
     * 笔数
     */
	private Integer amount;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
