package prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.northern.infrastructure.database.dao.UserMapper;

import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = "tech.northern.*")
public class PrototypeApplication {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/")
	String index() {
		List<Map<String, Object>> uses = userMapper.getAllUsers();

		return "hello spring boot2";
	}

	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
	}

}
