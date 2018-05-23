package win.zericzhao.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import win.zericzhao.servicefeign.service.SchedualServiceHello;

/**
 * @author Zhao Zhen
 * @description
 * @date Created in 2018/5/23 15:37
 * @since
 */
@RestController
public class HelloController {
    private SchedualServiceHello schedualServiceHello;
    HelloController(SchedualServiceHello schedualServiceHello) {
        this.schedualServiceHello = schedualServiceHello;
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return schedualServiceHello.sayHelloFromClientOne("service-hello-world");
    }
}
