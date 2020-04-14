package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.w3c.dom.UserDataHandler;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;

@Configuration
@ComponentScan(value="com.atguigu",includeFilters= {
		@Filter(type=FilterType.ANNOTATION,classes= {
				Controller.class
		}),@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class})
},useDefaultFilters=false)
public class MainConfig {
	 
	@Bean("person")
	public Person person01() {
		return new Person("lisi",19);
	}
}
