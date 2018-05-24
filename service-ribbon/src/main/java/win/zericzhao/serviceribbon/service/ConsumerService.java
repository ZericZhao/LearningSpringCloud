package win.zericzhao.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zhao Zhen
 * @description
 * @date Created in 2018/5/21 17:31
 * @since
 */
@Service
public class ConsumerService {

    private RestTemplate restTemplate;

    public ConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService() {
        return restTemplate.getForObject("http://SERVICE-HELLO-WORLD/service-instances/service-hello-world",String.class);
    }

    public String helloError() {
        return "Hello World Service Error!";
    }
}
