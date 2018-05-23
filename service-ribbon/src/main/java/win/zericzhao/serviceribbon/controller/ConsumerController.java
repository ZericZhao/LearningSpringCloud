package win.zericzhao.serviceribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.zericzhao.serviceribbon.service.ConsumerService;

/**
 * @author Zhao Zhen
 * @description
 * @date Created in 2018/5/21 17:30
 * @since
 */
@RestController
public class ConsumerController {

    private ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService){
        this.consumerService = consumerService;
    }

    @RequestMapping("/hello-world")
    public String helloWorld() {
        return consumerService.HelloService();
    }
}
