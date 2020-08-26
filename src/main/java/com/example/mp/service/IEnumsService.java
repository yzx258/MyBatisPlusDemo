package com.example.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mp.entity.Enums;

import java.util.List;

/**
 * @author yucw
 * @date 2020/8/26 13:54
 */
public interface IEnumsService extends IService<Enums> {

    /**
     * 新增枚举数据
     * @return
     */
    Enums add();

    /**
     * 新增枚举数据
     * @return
     */
    List<Enums> get();

}
