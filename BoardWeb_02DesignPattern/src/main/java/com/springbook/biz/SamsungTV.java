package com.springbook.biz;

import polymorphism.TV;

public class SamsungTV implements TV {
	public void powerOn() {
		System.out.println("Samsung TV�� ������ �׽��ϴ�.");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV�� ������ ���Ƚ��ϴ�.");
	}
	
	public void volumeUp() {
		System.out.println("Samsung TV�� ������ �÷Ƚ��ϴ�.");
	}
	
	public void volumeDown() {
		System.out.println("Samsung TV�� ������ ���Ƚ��ϴ�.");
	}
}
