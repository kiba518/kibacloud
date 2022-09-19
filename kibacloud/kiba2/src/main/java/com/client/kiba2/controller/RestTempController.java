package com.client.kiba2.controller;

import com.client.kiba2.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/RestTemp")
public class RestTempController {

    // 从Spring的容器中获取restTemplate
    @Autowired
    private RestTemplate restTemplate;

    /**
     * http://localhost:5182/RestTemp/TestRestRequest
     * @return
     */
    @GetMapping("/TestRestRequest")
    public ResponseEntity<String> TestRestRequest(){
        /**
         * 第一个参数：url
         * 第二个参数：返回值类型
         */
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:5181/helloWorld/GetName", String.class);
        System.out.println("状态码:"+entity.getStatusCode());
        System.out.println("响应体"+entity.getBody());
        return ResponseEntity.ok(entity.getBody());
    }

//    /**
//     * 通过/id查询
//     * http://localhost:8090/goods2 -->分页查找
//     */
//    @GetMapping("/TestRestRequest")
//    public ResponseEntity<String> TestRestRequest(@PathVariable Integer id){
//        /**
//         * 第一个参数：url
//         * 第二个参数：返回值类型
//         */
//        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:5181/helloWorld/GetName", String.class);
//        System.out.println("状态码:"+entity.getStatusCode());
//        System.out.println("响应体"+entity.getBody());
//        return ResponseEntity.ok(entity.getBody());
//    }
//
//    /**
//     * 添加数据
//     */
//    @PostMapping
//    public ResponseEntity<String> addGoods(@RequestBody Goods goods){
//        /**
//         * 第一个参数：url
//         * 第二个参数：数据
//         * 第三个参数：返回值类型
//         */
//        ResponseEntity<String> entity = restTemplate.postForEntity("http://localhost:8080/goods2", goods, String.class);
//        return entity;
//    }
//
//
//    /**
//     * 修改数据
//     */
//    @PutMapping
//    public ResponseEntity<String> updateGoods(@RequestBody Goods goods){
//        // 第一个参数：url
//        // 第二个参数：对象，数据
//        restTemplate.put("http://localhost:8080/goods2",goods);
//
////      return new ResponseEntity<>("成功", HttpStatus.OK);
//        return ResponseEntity.ok("修改成功");
//    }
//
//    /**
//     * 根据/id删除
//     */
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteGoods(@PathVariable("id") Integer id){
//        restTemplate.delete("http://localhost:8080/goods2/"+id,String.class);
//        return ResponseEntity.ok("删除成功");
//    }


}
