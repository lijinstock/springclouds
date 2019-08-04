/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/8/2 12:20
 */

package com.li.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class MyConfiguration {

    public MyConfiguration(){
        System.out.println("配置文件初始化了。。。。。");
    }

    @Bean
    public Date myDate(){
        return new Date();
    }

}
