package com.myspring.step01;

public class SonySpeaker implements Speaker {
	public SonySpeaker () {
		System.out.println("家聪 胶乔目 积己");
	}
	
	@Override
	public void volumnUp () {
		System.out.println("家聪 胶乔目: 家府 农霸");
	}
	
	@Override
	public void volumnDown () {
		System.out.println("家聪 胶乔目: 家府 累霸");
	}
}
