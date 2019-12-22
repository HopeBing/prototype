package tech.northern.infrastructure.database.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    List<Map<String, Object>> getAllUsers();
}
