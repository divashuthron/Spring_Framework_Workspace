/*
 * �������̽� ����� ���� Ŭ���� ������ ���� ���յ��� �����.
 * ������ ������ �̿����� ���� Java�� �⺻���� ���յ� ���� ���
 */

package com.springbook.biz;

import polymorphism.TV;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}
