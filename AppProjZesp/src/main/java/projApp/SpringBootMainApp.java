package projApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @authors Pawe� Miszkiel & Rafa� Teodorowski
 * 
 * 		PW, Wydzia� Elektryczny - Informatyka - semestr VI
 *
 * 2017-06-13
 */

@SpringBootApplication
@Configuration
public class SpringBootMainApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootMainApp.class, args);
	}

}