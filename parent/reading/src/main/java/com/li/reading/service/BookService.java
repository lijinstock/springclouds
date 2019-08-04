/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/7/28 8:48
 */

package com.li.reading.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class BookService {

    @HystrixCommand(fallbackMethod = "readListFallBack")
    public String readList(){
        RestTemplate restTemplate = new RestTemplate();
        URI uri = URI.create("http://localhost:2222/recommented");
        return restTemplate.getForObject(uri,String.class);
    }

    public String readListFallBack(){
        return "waiting for a minutes";
    }


}
