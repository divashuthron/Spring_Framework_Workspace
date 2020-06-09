package com.myspring.step01;

public class LgTV implements TV {
		private Speaker speaker;
		private int price;
		
		public LgTV () {
			System.out.println("디폴트 객체 생성");
		}
		
		public void setSpeaker(Speaker speaker) {
			System.out.println("speaker setter 메서드 호출");
			this.speaker = speaker;
		}
		
		public void setPrice(int price) {
			System.out.println("price setter 메서드 호출");
			this.price = price;
		}

		@Override
		public void powerOn() {
			System.out.println("LgTV---?쟾?썝 耳좊떎. 가격: " + price);
		}

		@Override
		public void powerOff() {
			System.out.println("LgTV---?쟾?썝 ?걟?떎.");
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
