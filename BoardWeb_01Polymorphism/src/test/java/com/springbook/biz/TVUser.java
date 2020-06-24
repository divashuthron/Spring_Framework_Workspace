/*
 * 인터페이스 상속을 통한 클래스 구현을 통해 결합도를 낮췄다.
 * 디자인 패턴을 이용하지 않은 Java의 기본적인 결합도 감소 방식
 */

package com.springbook.biz;

import polymorphism.TV;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}
