package win.zericzhao.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Zhao Zhen
 * @description
 * @date Created in 2018/5/23 13:42
 * @since
 */
@FeignClient(value = "service-hello-world")
public interface SchedualServiceHello {
    @RequestMapping(value = "/service-instances/{name}", method = RequestMethod.GET)
    String sayHelloFromClientOne(@PathVariable(value = "name") String name);
}
