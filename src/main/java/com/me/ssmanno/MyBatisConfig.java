package com.me.ssmanno;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.me.ssmanno")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@EnableWebMvc

public class MyBatisConfig
{
    @Bean
    public MapperScannerConfigurer scannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.me.ssmanno.dao");
        return  configurer;
    }
}
