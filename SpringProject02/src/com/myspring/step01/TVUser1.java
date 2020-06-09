package com.myspring.step01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser1 {
   public static void main(String[] args) throws FileNotFoundException {
	  GenericXmlApplicationContext factory = new GenericXmlApplicationContext("applicationContext1.xml"); 

      TV tv = (TV)factory.getBean("lg"); 
       
      tv.powerOn();
      tv.volumeUp();
      tv.volumeDown();
      tv.powerOff();
      
      factory.close();
   }
}
