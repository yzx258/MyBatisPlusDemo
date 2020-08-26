package com.example.mp.entity;

import java.util.Date;

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
public class Ratio extends Model<Ratio> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
	private String id;
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
	private Integer version;
    /**
     * 是否删除
     */
	private Integer deleted;
    /**
     * 倍率类型：1：NBA；2：CBA；3：其他
     */
	private Integer type;
    /**
     * 倍率状态：1：使用中；2：废弃
     */
	private Integer status;
    /**
     * 开始投注金额：30
     */
	@TableField("start_bet_price")
	private Integer startBetPrice;
    /**
     * 计算投注倍率：0.94
     */
	@TableField("bet_ratio")
	private Double betRatio;
    /**
     * 投注区间：[30,60,120]
     */
	@TableField("bet_range")
	private String betRange;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
