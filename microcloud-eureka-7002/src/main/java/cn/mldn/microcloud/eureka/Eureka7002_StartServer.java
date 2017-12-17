package cn.mldn.microcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer	
public class Eureka7002_StartServer {
	public static void main(String[] args) {
		SpringApplication.run(Eureka7002_StartServer.class, args) ;
	}
}
