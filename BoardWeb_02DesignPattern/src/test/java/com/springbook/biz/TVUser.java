/*
 * 클라이언트 소스를 수정하지 않고도 결합도를 낮추는 방법
 * BeanFactory 클래스를 이용해, args에 값을 담아 실행시키는 방식 - BeanFactory가 일종의 컨테이너 역할을 수행한다
 * 
 * Run As -> Run Configurations -> Arguments 에 값을 넣어 실행
 */

package com.springbook.biz;

import polymorphism.*;

public class TVUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
