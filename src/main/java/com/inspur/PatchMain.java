package com.inspur;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.events.Event;

/**
 * @Author ZhangTao
 * @Date 2023/08/02
 * @Description
 */

@SpringBootApplication
@MapperScan("com.inspur.mapper")
public class PatchMain {
    public static void main(String[] args) {
        SpringApplication.run(PatchMain.class, args);

    }
}
