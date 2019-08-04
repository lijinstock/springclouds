/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/28 10:10
 */

package com.li.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @RequestMapping("/available")
    public String available(){
        return "spring in action";
    }
    @RequestMapping("/checkout")
    public String checkout(){
        return "spring book in action";
    }
}
