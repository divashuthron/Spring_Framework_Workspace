package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("Samsung TV를 만들었습니다.");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("새로운 방법으로 소니 스피커를 만들었습니다.");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("새로운 방법으로 가격을 정의하였습니다.");
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
