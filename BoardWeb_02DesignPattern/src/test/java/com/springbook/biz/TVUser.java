/*
 * Ŭ���̾�Ʈ �ҽ��� �������� �ʰ� ���յ��� ���ߴ� ���
 * BeanFactory Ŭ������ �̿���, args�� ���� ��� �����Ű�� ��� - BeanFactory�� ������ �����̳� ������ �����Ѵ�
 * 
 * Run As -> Run Configurations -> Arguments �� ���� �־� ����
 */

package com.springbook.biz;

import polymorphism.*;

public class TVUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
