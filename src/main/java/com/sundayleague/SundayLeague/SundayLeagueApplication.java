package com.sundayleague.SundayLeague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SundayLeagueApplication {

	// 기본적으로 Spring Boot는 정적 리소스 로딩을 기본으로 하기 때문에 resource/static/index.html을 실행함
	public static void main(String[] args) {
		SpringApplication.run(SundayLeagueApplication.class, args);
	}

}
