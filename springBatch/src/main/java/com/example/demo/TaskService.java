package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements CommandLineRunner {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Override
    public void run(String... strings) throws Exception {
    
		// insert文を実行
        jdbcTemplate.update("INSERT INTO customers(first_name, last_name) VALUES ('John','Woo')");
        
    }

}
