package cn.mldn.microcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient 
public class Dept8003_ProviderStart {
	public static void main(String[] args) {
		SpringApplication.run(Dept8003_ProviderStart.class, args) ;
	}
}
