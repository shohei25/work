package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskController {
	// アプリケーションプロパティから実行タイミングを取得しジョブを実行する
	@Scheduled(cron = "${task2}")
	public void task2() {
		System.out.println("Hello!");
	}
	
	@Scheduled(cron = "${task3}")
	public void task3() {
		System.out.println("My name is");
	}

}
