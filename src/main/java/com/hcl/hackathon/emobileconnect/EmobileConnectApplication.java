package com.hcl.hackathon.emobileconnect;

import com.hcl.hackathon.emobileconnect.repo.RequestStatusRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackageClasses = RequestStatusRepo.class)
public class EmobileConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmobileConnectApplication.class, args);
	}


	@Configuration
	public class EmobileConnectApplicationConfig {
		@Bean
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
					.build();
		}
	}

}
