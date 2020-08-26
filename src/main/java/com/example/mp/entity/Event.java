package com.example.mp.entity;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Event extends Model<Event> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
	private String id;
    /**
     * 比赛时间
     */
	@TableField("event_time")
	private String eventTime;
    /**
     * 比赛名称
     */
	private String name;
    /**
     * 竞猜结果
     */
	@TableField("quiz_results")
	private String quizResults;
    /**
     * 赛事结果
     */
	private String results;
    /**
     * 赛事第一节
     */
	@TableField("period_one")
	private String periodOne;
    /**
     * 赛事第二节
     */
	@TableField("period_tow")
	private String periodTow;
    /**
     * 赛事第三节
     */
	@TableField("period_three")
	private String periodThree;
    /**
     * 赛事第四节
     */
	@TableField("period_four")
	private String periodFour;
    /**
     * 赛事第加时一节
     */
	@TableField("over_time_one")
	private String overTimeOne;
    /**
     * 赛事第加时二节
     */
	@TableField("over_time_tow")
	private String overTimeTow;
    /**
     * 赛事第加时三节
     */
	@TableField("over_time_three")
	private String overTimeThree;
    /**
     * 赛事第加时四节
     */
	@TableField("over_time_four")
	private String overTimeFour;
    /**
     * 赛事第加时五节
     */
	@TableField("over_time_five")
	private String overTimeFive;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 版本号
     */
	private String version;
    /**
     * 逻辑删除：【0：没删除；1：删除】
     */
	private Integer deleted;
    /**
     * 赛事类型
     */
	private Integer type;
    /**
     * 赛事类型名称
     */
	@TableField("type_name")
	private String typeName;
    /**
     * 开始日期
     */
	@TableField("start_time")
	private String startTime;
    /**
     * 赛事状态：0：进行中；1：已结束；2：已核对
     */
	private Integer status;
    /**
     * 年份
     */
	private String year;
    /**
     * 月份
     */
	private String month;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
