package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("�Ҵ� ����Ŀ�� �����߾��.");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("�Ҵ� ����Ŀ�� �Ҹ��� �������.");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("�Ҵ� ����Ŀ�� �Ҹ��� �ٿ����.");
	}
}
