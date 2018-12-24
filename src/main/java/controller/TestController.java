package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/12/24 0024.
 */
@RestController
@EnableAutoConfiguration
public class TestController {
    @RequestMapping("/hello")
    private String index(){
        return "Hello World!";
    }
}
