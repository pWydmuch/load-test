package com.example.servicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ServiceBClientConfig {

    @Value("${SERVICE_B_SERVICE_SERVICE_HOST}")
    private String serviceBServiceHost;

    @Value("${SERVICE_B_SERVICE_SERVICE_PORT}")
    private Integer serviceBServicePort;

    @Bean
    ServiceBClient serviceBClient() {
        RestClient restClient = RestClient.builder()
                .baseUrl("http://" + serviceBServiceHost + ":" + serviceBServicePort)
                .build();
        RestClientAdapter exchangeAdapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(exchangeAdapter).build();
        return factory.createClient(ServiceBClient.class);
    }

}

@HttpExchange
interface ServiceBClient {
    @GetExchange("/name")
    String name();
}
