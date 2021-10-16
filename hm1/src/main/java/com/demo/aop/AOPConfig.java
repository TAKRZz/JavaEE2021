package com.demo.aop;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {

	@Bean
	public Test test(){
		return new Test();
	}

	@Bean
	public ProfileAspect profileAspect(){
		return new ProfileAspect();
	}

}


 