package demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName demo
 * @Auther kaifengliu
 * @DATE 2025/4/9 15:06
 **/
@RestController
@RequestMapping("/demo")
public class demo {
    @RequestMapping("/run")
    public void run() {
        System.out.println("111111111");
    }
}
