package win.zericzhao.servicehello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zhao Zhen
 * @description
 * @date Created in 2018/5/21 16:09
 * @since
 */
@RestController
@RefreshScope
public class HelloWorldController {

    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @Value("${customer.name}")
    private String name;

    public HelloWorldController(DiscoveryClient discoveryClient){
        this.discoveryClient = discoveryClient;
    }

    @RequestMapping(value = "/service-instances/{applicationName}", method = RequestMethod.GET)
    public String serviceInstancesByApplicationName(
            @PathVariable String applicationName){
        return applicationName+" from port: "+port+" Hello, "+name;
    }
}
