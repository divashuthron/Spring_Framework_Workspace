package com.springbook.biz;

import polymorphism.TV;

public class SamsungTV implements TV {
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
}
