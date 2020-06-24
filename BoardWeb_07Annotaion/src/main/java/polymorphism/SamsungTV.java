package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("Samsung TV�� ��������ϴ�.");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("���ο� ������� �Ҵ� ����Ŀ�� ��������ϴ�.");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("���ο� ������� ������ �����Ͽ����ϴ�.");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("Samsung TV�� ������ �׽��ϴ�.");
		System.out.println("����ᰡ " + price + "���� �Ǿ����ϴ�.");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV�� ������ ���Ƚ��ϴ�.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
