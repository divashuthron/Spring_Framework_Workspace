package com.springbook.biz;

import polymorphism.*;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
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
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
	/*
	 public void destroyMethod() {
	 	System.out.println("Samsung TV�� ���ֱ� ���� �ֺ��� �����߾��.");
	 }
	 */
}
