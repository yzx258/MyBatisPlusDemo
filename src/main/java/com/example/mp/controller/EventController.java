package com.example.mp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mp.entity.Event;
import com.example.mp.entity.dto.EventPageDTO;
import com.example.mp.entity.spec.EventPageSpec;
import com.example.mp.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lqh
 * @since 2020-08-25
 */
@RestController
@RequestMapping("/event")
public class EventController {
	@Autowired
    private IEventService eventService;

	@PostMapping("/test")
    public IPage<EventPageDTO> page(@RequestBody EventPageSpec spec){
	    return eventService.search(spec);
    }

    @PostMapping("/test1")
    public IPage<Event> page1(@RequestBody EventPageSpec spec){
        return eventService.page(spec);
    }

    @GetMapping("/test2")
    public Event page2(){
        return eventService.getEvent();
    }

}
