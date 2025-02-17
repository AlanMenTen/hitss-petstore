package mx.alan.spring.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class PetstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetstoreApplication.class, args);
	}

}
