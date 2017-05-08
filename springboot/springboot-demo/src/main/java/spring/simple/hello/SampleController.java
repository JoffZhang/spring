package spring.simple.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : ZhangYun
 * @Description :
 * @Date :  2017/4/27.
 */
@Controller
@SpringBootApplication
public class SampleController {

    @ResponseBody
    @RequestMapping(value="/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }
}
