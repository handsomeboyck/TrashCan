package cn.ickck.environmental;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ickck.environmental.mapper")
public class EnvironmentalApplication {


	public static void main(String[] args) {
		SpringApplication.run(EnvironmentalApplication.class, args);
	}


}
