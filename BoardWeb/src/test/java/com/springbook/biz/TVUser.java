/*
 * LG TV�� ��ü�ϰ��� �Ѵٸ� Ŭ��������� �޼ҵ���� ���� ��ü�ؾ��Ѵ�.
 * ��ó�� ���յ��� ���� ���α׷��� ����/������ �������� ���Ѵ�.
 */

package com.springbook.biz;

public class TVUser {
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		/*
		 * LgTV tv = new LgTV();
		 * tv.powerOn();
		 * tv.powerOff();
		 * tv.volumeUp();
		 * tv.volumeDown();
		 */
	}

}
