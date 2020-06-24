/*
 * LG TV로 교체하고자 한다면 클래스명부터 메소드까지 전부 교체해야한다.
 * 이처럼 결합도가 높은 프로그램은 유지/보수에 복잡함을 더한다.
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
