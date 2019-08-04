/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/28 7:45
 */

package com.li.bookstore.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

    @RequestMapping("/recommented")
    //@HystrixCommand(fallbackMethod = "read")
    public String recommented(){
        return "spring in Action(Manning),cloud native java";
    }








}
