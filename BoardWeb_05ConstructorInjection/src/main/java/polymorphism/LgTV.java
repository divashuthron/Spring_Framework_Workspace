package polymorphism;

public class LgTV implements TV {
	public void powerOn() {
		System.out.println("LG TV�� ������ �׽��ϴ�.");
	}
	
	public void powerOff() {
		System.out.println("LG TV�� ������ ���Ƚ��ϴ�.");
	}
	
	public void volumeUp() {
		System.out.println("LG TV�� ������ �÷Ƚ��ϴ�.");
	}
	
	public void volumeDown() {
		System.out.println("LG TV�� ������ ���Ƚ��ϴ�.");
	}
}