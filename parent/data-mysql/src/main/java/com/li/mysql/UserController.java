/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/30 21:44
 */

package com.li.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {

    @Autowired
    private UserRespository userRespository;


    @GetMapping(path = "/add")
    @ResponseBody
    public String addUser(@RequestParam String name, @RequestParam String email){

        User user = new User();
        user.setEmail(email);
        user.setName(name);
        userRespository.save(user);
        return "saved";
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<User> getAllUser(){
        return userRespository.findAll();
    }





}
