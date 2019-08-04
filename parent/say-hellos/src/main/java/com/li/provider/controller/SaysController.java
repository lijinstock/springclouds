/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/27 13:22
 */

package com.li.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class SaysController {

    @RequestMapping(value = "/greeting")
    public String greet(){
        List<String> greetings = Arrays.asList("hello", "goodmoring", "goodnight");
        Random random = new Random();
        String str = greetings.get(random.nextInt(3));
        System.out.println(str);
        return str;
    }

    @RequestMapping(value = "/")
    public String home(){
        return "new world";
    }





}
