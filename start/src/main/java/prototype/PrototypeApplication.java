package prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = "tech.northern.*")
public class PrototypeApplication {


	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
	}

}
