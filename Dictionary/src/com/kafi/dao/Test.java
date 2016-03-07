package com.kafi.dao;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		FileSystemXmlApplicationContext obj=new FileSystemXmlApplicationContext("C:/Users/Yohannes/Desktop/workspace/Dictionary/WebContent/WEB-INF/Dictionary-servlet.xml");
		Kitecho kit=(Kitecho)obj.getBean("kitecho");
		Words wd=new Words();
		wd=kit.findRecord("a");
		System.out.println(wd.getIngliizo());
		System.out.println(wd.getAmmari());

	}

}
