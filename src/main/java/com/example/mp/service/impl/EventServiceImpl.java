package com.example.mp.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mp.entity.Event;
import com.example.mp.entity.dto.EventPageDTO;
import com.example.mp.entity.spec.EventPageSpec;
import com.example.mp.mapper.EventMapper;
import com.example.mp.service.IEventService;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh
 * @since 2020-08-25
 */
@Service
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements IEventService {

    /**
     * 分页查询数据
     * @param spec
     * @return
     */
    @Override
    public IPage<EventPageDTO> search(EventPageSpec spec) {
        IPage<EventPageDTO> search = this.baseMapper.search(spec.getPage());
        return search;
    }

    @Override
    public IPage<Event> page(EventPageSpec spec) {
        IPage<Event> userPage = new Page<Event>(1, 5);
        userPage = this.baseMapper.selectPage(userPage, null);
        return userPage;
    }

    @Override
    public Event getEvent() {
        return this.getBaseMapper().selectById("1277974577521528834");
    }
}
