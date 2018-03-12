package br.gov.mg.meioambiente.simge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
//@ComponentScan(basePackages = "br.gov.mg.meioambiente.simge")
//@EnableJpaRepositories("br.gov.mg.meioambiente.simge.repository")
public class SimgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimgeApplication.class, args);
	}
}
