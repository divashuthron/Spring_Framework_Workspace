package com.myspring.step01;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV () {
		System.out.println("디폴트 객체 생성");
	}
	
	public SamsungTV (Speaker speaker) {
		this.speaker = speaker;
		System.out.println("오버로딩 매개변수1 객체 생성");
	}
	
	public SamsungTV (Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
		System.out.println("오버로딩 매개변수2 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV---?쟾?썝 耳좊떎. 가격: " + price);
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---?쟾?썝 ?걟?떎.");
	}

	@Override
	public void volumeUp() {
		speaker.volumnUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumnDown();
	}
}
