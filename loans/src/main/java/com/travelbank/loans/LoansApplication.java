package com.travelbank.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.travelbank.loans.controller") })
@EnableJpaRepositories("com.travelbank.loans.repository")
@EntityScan("com.travelbank.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "TravelBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Vinay Teja",
						email = "vinayteja@gmail.com",
						url = "https://www.travelbank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.travelbank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "TravelBank Loans microservice REST API Documentation",
				url = "https://www.travelbank.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
