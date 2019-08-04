/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/27 11:55
 */

package com.li.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class SayController {

//    @RequestMapping("/greeting")
//    public String greet(){
//        List<String> greetings = Arrays.asList("hello1", "hello2", "hello3");
//        Random r = new Random() ;
//        return greetings.get(r.nextInt(3)) ;
//    }
//
//    @RequestMapping("/")
//    public String home(){
//        return "Hi!!" ;
//    }


    @RequestMapping(value = "/greeting")
    public String greet(){
        List<String> greetings = Arrays.asList("hello", "goodmoring", "goodnight");
        Random random = new Random();
        return greetings.get(random.nextInt(3));
    }

    @RequestMapping(value = "/")
    public String home(){
        return "new world";
    }


}
