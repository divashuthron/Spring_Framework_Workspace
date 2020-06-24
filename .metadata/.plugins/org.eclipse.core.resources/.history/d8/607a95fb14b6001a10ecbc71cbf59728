package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("Samsung TV를 만들었습니다.");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("Samsung TV를 두 번째로 만들었습니다.");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("Samsung TV를 세 번째로 만들었습니다.");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("Samsung TV의 전원을 켰습니다.");
		System.out.println("전기료가 " + price + "원이 되었습니다.");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV의 전원을 내렸습니다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
