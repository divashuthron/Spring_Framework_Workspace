package com.myspring.step01;

public class LgTV implements TV {
		Speaker speaker;
		
		public LgTV (Speaker speaker) {
			this.speaker = speaker;
		}

		@Override
		public void powerOn() {
			System.out.println("LgTV---? ? μΌ λ€.");
		}

		@Override
		public void powerOff() {
			System.out.println("LgTV---? ? ??€.");
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
