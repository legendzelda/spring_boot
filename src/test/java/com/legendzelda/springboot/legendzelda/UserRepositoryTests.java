package com.legendzelda.springboot.legendzelda;

import com.legendzelda.springboot.legendzelda.dao.UserRepository;
import com.legendzelda.springboot.legendzelda.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * created by bu.han on 2018/2/1
 * description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTests {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void test() throws Exception {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
		//userRepository.save(new User("aa1", "aa123456","aa@126.com", "aa", formattedDate));
		//userRepository.save(new User("bb2", "bb123456","bb@126.com", "bb", formattedDate));
		//userRepository.save(new User("cc3", "cc123456","cc@126.com", "cc", formattedDate));
		
		Assert.assertEquals(3, userRepository.findAll().size());
		User user = userRepository.findByUserName("aa1");
		Assert.assertEquals("aa",userRepository.findByUserName("aa1").getNickName());
		Assert.assertEquals("cc", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
		Assert.assertEquals("bbb", userRepository.findByUserNameAndEmail("bb2", "bb@126.com").getNickName());
		//userRepository.delete(userRepository.findByUserName("aa1"));
	}
}
