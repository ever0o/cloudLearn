package com.ever.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author WangY
 * @Title:
 * @Package
 * @Description:
 * @date 2020/10/1416:44
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentFiveMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentFiveMain.class,args);
    }

    @Bean
    public ServletRegistrationBean getservlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet() ;
        ServletRegistrationBean servletRegistrationBean =new ServletRegistrationBean(streamServlet) ;
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.addUrlMappings("/hystrix.stream");
        servletRegistrationBean.setName("HystrixMetricsStreamServlet");
        return servletRegistrationBean;
    }
}
