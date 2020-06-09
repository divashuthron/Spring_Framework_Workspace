package com.myspring.step01;

public class SamsungTV implements TV {
	Speaker speaker;
	
	public SamsungTV (Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV---? ? μΌ λ€.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---? ? ??€.");
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
