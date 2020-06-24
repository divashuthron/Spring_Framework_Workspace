package com.springbook.biz;

import polymorphism.*;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	
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
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
	/*
	 public void destroyMethod() {
	 	System.out.println("Samsung TV를 없애기 전에 주변을 정리했어요.");
	 }
	 */
}
