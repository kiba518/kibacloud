package com.clinet.kiba3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Remote")
public class RemoteController {
    @Autowired
    RestTemplate restTemplate;

    /**
     * http://localhost:5183/Remote/TestRestRequest
     * @return
     */
    @GetMapping("/TestRestRequest")
    public ResponseEntity<String> TestRestRequest() {
        /**
         * 第一个参数：url——http://eureka-kiba/helloWorld/GetName 这里把ip替换为在eureka中注册的名字
         * 第二个参数：返回值类型
         */
        ResponseEntity<String> entity = restTemplate.getForEntity("http://eureka-kiba/helloWorld/GetName", String.class);
        System.out.println("状态码:" + entity.getStatusCode());
        System.out.println("响应体" + entity.getBody());

        return ResponseEntity.ok(entity.getBody());

    }
}
