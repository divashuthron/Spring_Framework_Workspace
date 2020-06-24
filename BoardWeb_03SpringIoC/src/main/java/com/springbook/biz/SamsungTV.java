package com.springbook.biz;

import polymorphism.TV;

public class SamsungTV implements TV {
	/*
	public void initMethod() {
		System.out.println("Samsung TV를 만들기 전에 주변을 정리했어요.");
	}
	*/
	
	public SamsungTV() {
		System.out.println("Samsung TV를 만들었습니다.");
	}
	
	public void powerOn() {
		System.out.println("Samsung TV의 전원을 켰습니다.");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV의 전원을 내렸습니다.");
	}
	
	public void volumeUp() {
		System.out.println("Samsung TV의 음량을 올렸습니다.");
	}
	
	public void volumeDown() {
		System.out.println("Samsung TV의 음량을 내렸습니다.");
	}
	
	/*
	 public void destroyMethod() {
	 	System.out.println("Samsung TV를 없애기 전에 주변을 정리했어요.");
	 }
	 */
}
