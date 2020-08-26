package com.example.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yiautos
 */
@SpringBootApplication
@MapperScan("com.example.mp.mapper")
public class MpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpApplication.class, args);
    }

}
