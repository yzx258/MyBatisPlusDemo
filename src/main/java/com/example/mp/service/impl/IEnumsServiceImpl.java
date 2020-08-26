package com.example.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mp.entity.Enums;
import com.example.mp.enums.UserStatusEnums;
import com.example.mp.mapper.EnumsMapper;
import com.example.mp.service.IEnumsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yucw
 * @date 2020/8/26 13:54
 */
@Slf4j
@Service
public class IEnumsServiceImpl extends ServiceImpl<EnumsMapper, Enums> implements IEnumsService {

    @Override
    public Enums add() {
        Enums enums = new Enums();
        enums.setName("测试枚举");
        enums.setStatus(UserStatusEnums.HOUSEHOLD_CAR);
        enums.setType(UserStatusEnums.NET_ABOUT_CAR);
        enums.insert();
        return enums;
    }

    @Override
    public List<Enums> get() {
        return this.baseMapper.selectList(null);
    }
}
