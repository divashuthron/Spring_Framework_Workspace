package com.springbook.biz;

import polymorphism.TV;

public class SamsungTV implements TV {
	/*
	public void initMethod() {
		System.out.println("Samsung TV�� ����� ���� �ֺ��� �����߾��.");
	}
	*/
	
	public SamsungTV() {
		System.out.println("Samsung TV�� ��������ϴ�.");
	}
	
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
	
	/*
	 public void destroyMethod() {
	 	System.out.println("Samsung TV�� ���ֱ� ���� �ֺ��� �����߾��.");
	 }
	 */
}
