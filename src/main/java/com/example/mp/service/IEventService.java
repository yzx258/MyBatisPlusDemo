package com.example.mp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mp.entity.Event;
import com.example.mp.entity.dto.EventPageDTO;
import com.example.mp.entity.spec.EventPageSpec;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lqh
 * @since 2020-08-25
 */
public interface IEventService extends IService<Event> {

    /**
     * 询价：分页获取询价信息
     * @param spec
     * @return
     */
    IPage<EventPageDTO> search(EventPageSpec spec);

    /**
     * 询价：分页获取询价信息
     * @param spec
     * @return
     */
    IPage<Event> page(EventPageSpec spec);

    Event getEvent();
}
