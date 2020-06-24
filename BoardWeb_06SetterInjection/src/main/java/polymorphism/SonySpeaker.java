package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("소니 스피커를 생성했어요.");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("소니 스피커의 소리를 높였어요.");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("소니 스피커의 소리를 줄였어요.");
	}
}
