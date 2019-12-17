package com.java.designpattern.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.designpattern.workflows.AccountManagement;

@Configuration
public class Config {

	@Autowired
	private ApplicationContext context;
	
	/*@Bean
	public AccountManagement initHeroAcctMng (@Value("${acct.impl.hero}") String hero) {
		return (AccountManagement) context.getBean(hero);
	}
	
	@Bean
	public AccountManagement initVillainAcctMng (@Value("${acct.impl.villain}") String villain) {
		return (AccountManagement) context.getBean(villain);
	}*/
}
