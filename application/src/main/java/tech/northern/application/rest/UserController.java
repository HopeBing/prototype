package tech.northern.application.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.northern.infrastructure.database.dao.UserMapper;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    String index() {
        List<Map<String, Object>> uses = userMapper.getAllUsers();

        return "hello spring boot2";
    }

}
