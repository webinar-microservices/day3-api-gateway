package in.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Day3ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day3ApiGatewayApplication.class, args);
	}

}
