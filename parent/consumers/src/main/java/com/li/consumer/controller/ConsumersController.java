/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/27 18:21
 */

package com.li.consumer.controller;


import com.li.consumer.config.SayGreetingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "say-greeting", configuration = SayGreetingConfiguration.class)
public class ConsumersController {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    };
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name",defaultValue = "springcloud") String name){
        String greeting = this.restTemplate.getForObject("http://say-greeting/greeting",String.class);
        return String.format("%s, %s!",greeting,name);
    }





}
