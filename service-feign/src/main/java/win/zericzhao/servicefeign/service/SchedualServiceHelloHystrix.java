package win.zericzhao.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author Zhao Zhen
 * @description
 * @date Created in 2018/5/24 9:46
 * @since
 */
@Component
public class SchedualServiceHelloHystrix implements SchedualServiceHello{
    @Override
    public String sayHelloFromClientOne(String name) {
        return "Sorry, Service Hello World Error!";
    }
}
