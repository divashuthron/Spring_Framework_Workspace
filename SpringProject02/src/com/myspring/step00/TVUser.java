package com.myspring.step00;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
   public static void main(String[] args) throws FileNotFoundException {
	  GenericXmlApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); 

      TV tv = (TV)factory.getBean("lg"); 
       
      tv.powerOn();
      tv.volumeUp();
      tv.volumeDown();
      tv.powerOff();
   }
}
