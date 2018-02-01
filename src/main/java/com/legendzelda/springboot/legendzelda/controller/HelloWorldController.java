package com.legendzelda.springboot.legendzelda.controller;
import com.legendzelda.springboot.legendzelda.dao.UserRepository;
import com.legendzelda.springboot.legendzelda.domain.Customer;
import com.legendzelda.springboot.legendzelda.domain.User;
import com.legendzelda.springboot.legendzelda.properties.NeoProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * created by bu.han on 2018/1/31
 * description:
 * @author Administrator
 */
@RestController
public class HelloWorldController {
	
	private static Logger logger = Logger.getLogger(HelloWorldController.class);
	
	@Resource
	private NeoProperties neoProperties;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/hello")
	public Object index() {
		//return "Hello World!!!";
		logger.info("this is my first spring boot controller 任贤齐 ! " + neoProperties.getTitle());
		User user = userRepository.findByUserName("aa1");
		logger.error(user);
		logger.fatal(user);
		return new Customer(1,"liyan");
	}
}
