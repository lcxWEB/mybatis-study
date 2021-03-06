package com.change.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: lichunxia
 * @create: 2021-01-27 20:06
 */
@RestController
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("query")
    public Map<String, Object> map() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select  * from name");
        return maps.get(0);
    }

}
