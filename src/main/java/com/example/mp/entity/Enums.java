package com.example.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.example.mp.enums.UserStatusEnums;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yucw
 * @date 2020/8/26 13:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Enums  extends Model<Enums> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String name;

    private UserStatusEnums status;

    private UserStatusEnums type;

    @Override
    protected Serializable pkVal() {
        return this.id;}
}
