package com.boot.girl;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
		System.out.println("第一次提交");
		System.out.println("第3次提交");
		/*SpringApplication sp=new SpringApplication();
		sp.setBannerMode(Banner.Mode.OFF);
		sp.run(GirlApplication.class, args);*/
	}
}
