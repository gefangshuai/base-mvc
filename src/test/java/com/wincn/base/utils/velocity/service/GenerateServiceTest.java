package com.wincn.base.utils.velocity.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.wincn.permission.user.dao.UserDAO;
import com.wincn.permission.user.service.UserService;

@ContextConfiguration(locations = { "/config/spring/test-config.xml" })
@ActiveProfiles(value = "test")
public class GenerateServiceTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private UserService userService;

	@Test
	public void testname() {
		
	}
}
