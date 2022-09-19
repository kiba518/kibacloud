package com.client.kiba2.util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate工具类，主要用来提供RestTemplate对象
 */
@Configuration//加上这个注解作用，可以被Spring扫描
public class RestTemplateConfig {
    /**
     * 创建RestTemplate对象，将RestTemplate对象的生命周期的管理交给Spring
     */
    @Bean
    public RestTemplate restTemplate(){
        // RestTemplate restTemplate = new RestTemplate();
        //设置中文乱码问题方式一
        // restTemplate.getMessageConverters().add(1,new StringHttpMessageConverter(Charset.forName("UTF-8")));
        // 设置中文乱码问题方式二
        // restTemplate.getMessageConverters().set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8)); // 支持中文编码
        return new RestTemplate();
    }
}
