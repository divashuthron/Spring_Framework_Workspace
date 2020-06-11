package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		//User-1. 스프링 컨테이너 생성 및 호출
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//User-2. 컨텍스트 생성 및 빈즈 생성 (userServiceImpl.java에 존재하는 userDAO 객체)
		UserService userService = (UserService) container.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		//User-4. userService 객체를 통해 userDAO를 활용한다.
		UserVO user = userService.getUser(vo);
		if (user != null) {
			System.out.println(user.getName() + "님, 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
		container.close();
	}
}
