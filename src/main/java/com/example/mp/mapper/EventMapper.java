package com.example.mp.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.entity.Event;
import com.example.mp.entity.dto.EventPageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author lqh
 * @since 2020-08-25
 */
@Mapper
public interface EventMapper extends BaseMapper<Event> {

    /**
     * 分页获取数据
     * @param page
     * @return
     */
    IPage<EventPageDTO> search(@Param("page") Page<Event> page);

}