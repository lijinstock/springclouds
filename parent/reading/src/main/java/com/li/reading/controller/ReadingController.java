/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/28 8:17
 */

package com.li.reading.controller;

import com.li.reading.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class ReadingController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/to-read")
    public String readList(){

        return bookService.readList();
    }

}
