package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		//User-1. ������ �����̳� ���� �� ȣ��
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//User-2. ���ؽ�Ʈ ���� �� ���� ���� (userServiceImpl.java�� �����ϴ� userDAO ��ü)
		UserService userService = (UserService) container.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		//User-4. userService ��ü�� ���� userDAO�� Ȱ���Ѵ�.
		UserVO user = userService.getUser(vo);
		if (user != null) {
			System.out.println(user.getName() + "��, ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		container.close();
	}
}