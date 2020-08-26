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
public class Instruction extends Model<Instruction> {

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
     * 下注金额
     */
	@TableField("bet_amount")
	private Integer betAmount;
    /**
     * 下注单双
     */
	@TableField("bet_single_or_double")
	private Integer betSingleOrDouble;
    /**
     * 下注场次：1：第一节；2：第二节；3：第三节；4：第四节
     */
	@TableField("bet_session")
	private Integer betSession;
    /**
     * 下注场次名称：第一节 单双；第二节 单双；第三节 单双；第四节 单双
     */
	@TableField("bet_session_name")
	private String betSessionName;
    /**
     * 下注状态：1：需要购买；2：已购买；3：已红单；4：四节全黑
     */
	@TableField("bet_status")
	private Integer betStatus;
    /**
     * 下注主队：湖人
     */
	@TableField("bet_htn")
	private String betHtn;
    /**
     * 下注客队：快船
     */
	@TableField("bet_atn")
	private String betAtn;
    /**
     * 失败次数，默认0
     */
	@TableField("bet_number")
	private Integer betNumber;
    /**
     * 下注时间
     */
	@TableField("bet_time")
	private String betTime;
    /**
     * 下注：1：第五节；2：第六节；3：第七节；4：第八节
     */
	@TableField("bet_session_two")
	private Integer betSessionTwo;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
