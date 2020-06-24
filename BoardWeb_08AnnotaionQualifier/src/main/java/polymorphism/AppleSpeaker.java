package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("애플 스피커를 생성했어요.");
	}

	@Override
	public void volumeUp() {
		System.out.println("애플 스피커의 소리를 높였어요.");
	}

	@Override
	public void volumeDown() {
		System.out.println("애플 스피커의 소리를 줄였어요.");
	}
}
