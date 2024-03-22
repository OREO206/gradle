package com.subin.basic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// @Configuration: Spring boot 기본설정 지정 및 변경
@Configuration
// Cors 관련 설정을 변경하기 위해 WebMvcConfigurer 인터페이스에 존재하는 addCorsMappings 메서드를 오버라이드 하여 재정의
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
        // 어떤 Request URL 패턴에 대하여 Cors 정책을 지정할 건지 
        .addMapping("/**") // 모든 패턴
            // 해당 Request URL 패턴의 어떤 메서드에 Cors 정책을 허용할 건지
            .allowedMethods("*") // 모든 메서드에 허용
            // 해당 Request URL 패턴의 어떤 출처에 Cors 정책을 허용할 건지
            .allowedOrigins("*"); // 모든 오리진에 허용
    }

}