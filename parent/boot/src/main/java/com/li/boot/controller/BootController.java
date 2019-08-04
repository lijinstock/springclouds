/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/8/2 13:06
 */

package com.li.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World!";
    }

}
