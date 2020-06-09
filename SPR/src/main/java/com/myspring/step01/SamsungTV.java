package com.myspring.step01;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV () {
		System.out.println("����Ʈ ��ü ����");
	}
	
	public SamsungTV (Speaker speaker) {
		this.speaker = speaker;
		System.out.println("�����ε� �Ű�����1 ��ü ����");
	}
	
	public SamsungTV (Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
		System.out.println("�����ε� �Ű�����2 ��ü ����");
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV---?��?�� 켠다. ����: " + price);
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---?��?�� ?��?��.");
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
