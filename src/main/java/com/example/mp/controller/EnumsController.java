package com.example.mp.controller;

import com.example.mp.entity.Enums;
import com.example.mp.service.IEnumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yucw
 * @date 2020/8/26 13:58
 */
@RestController
@RequestMapping("/enums")
public class EnumsController {

    @Autowired
    private IEnumsService iEnumsService;

    @GetMapping("/test")
    public Enums add(){
        return iEnumsService.add();
    }

    @GetMapping("/test1")
    public List<Enums> get(){
        return iEnumsService.get();
    }

}
