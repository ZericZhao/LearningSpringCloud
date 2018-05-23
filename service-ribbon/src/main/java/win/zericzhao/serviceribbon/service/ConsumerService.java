package win.zericzhao.serviceribbon.service;

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

    public String HelloService() {
        return restTemplate.getForObject("http://SERVICE-HELLO-WORLD/service-instances/service-hello-world",String.class);
    }
}
