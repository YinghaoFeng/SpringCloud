package cn.mldn.microcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringBootApplication 
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.mldn.microcloud.service"})
public class Consumer80_FeignStart {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80_FeignStart.class, args);
	}
}
