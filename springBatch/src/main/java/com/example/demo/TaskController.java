package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	// アプリケーションプロパティから実行タイミングを取得しジョブを実行する
	@Scheduled(cron = "${task2}")
	public void task2() {
		System.out.println("1minutes!");
	}
	
	@Scheduled(cron = "${task3}")
	public void task3() throws Exception {
		taskService.run();
	}

}
