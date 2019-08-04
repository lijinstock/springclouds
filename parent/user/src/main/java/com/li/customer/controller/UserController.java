/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/26 21:18
 */

package com.li.customer.controller;


import com.li.customer.config.SayhellosConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.sax.SAXTransformerFactory;


@RestController
@RibbonClient(name = "say-hellos", configuration = SayhellosConfiguration.class)
public class UserController {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    };

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name",defaultValue = "springcloud") String name){
        String greeting = this.restTemplate.getForObject("http://say-hellos/greeting",String.class);
        return String.format("%s, %s!",greeting,name);
    }




}
