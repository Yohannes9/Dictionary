package com.kafi.biish;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class test {

	public static void main(String[] args) {
		
		String jaString = new String("\u65e5\u672c\u8a9e\u6587\u5b57\u5217");
	   // writeOutput(jaString); 
		String x="1201";
		
	     System.out.println((char)Integer.parseInt(x));
	    System.out.println(readInput());
	   // new ShowString(readInput(), "Conversion Demo");

	}
	static String readInput() {
	    StringBuffer buffer = new StringBuffer();
	    try {
	    	
	    
	        FileInputStream fis = new FileInputStream("C:/Users/Yohannes/Desktop/test.txt");
	        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
	        Reader in = new BufferedReader(isr);
	        int ch;
	        while ((ch = in.read()) > -1) {
	            buffer.append((char)ch);
	        }
	        in.close();
	        return buffer.toString();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	        return null;
	    }

}}
