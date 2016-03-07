package unicodetest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Test {
	

	public static void main(String[] args) throws UnsupportedEncodingException {
		//Character ch=new Character();
		System.out.println("በቃንቃው ከአናባቢዎች አንዱ");
		System.out.println("ለምን በኛ");
		System.out.println( newString('\u1200'));
		System.out.println( newString('\u1210'));
		System.out.println( newString('\u1201'));
		System.out.println( newString('\u1302'));
		System.out.println( newString('\u1400'));
		System.out.println( newString('\u1500'));
		//System.out.println(Character.UnicodeBlock.of('\u1200'));
		//PrintStream out = new PrintStream(System.out, true, "UTF-16");
		//out.println('\u1200');
		//out.println('\u1200');
		System.out.println("በቃንቃው ከአናባቢዎች አንዱ");
		System.out.println("ለምን በኛ");
		String t="ሀ";
		int a=t.codePointAt(0);
		System.out.println(a);
		String hex="4608";
		String hexa="4609";
		int intval=Integer.parseInt(hex);
		System.out.println((char)intval);
		int intvala=Integer.parseInt(hexa);
		System.out.println((char)intvala);
		String jaString = new String("\u65e5\u672c\u8a9e\u6587\u5b57\u5217");
		System.out.println("what?"+jaString);
	    writeOutput(jaString); 
	    String inputString = readInput();
	    String displayString = jaString + " " + inputString;
	    System.out.println(displayString);
	}
	static String newString(int codePoint) {
	    return new String(Character.toChars(codePoint));
	}
	static String readInput() {
	    StringBuffer buffer = new StringBuffer();
	    try {
	        FileInputStream fis = new FileInputStream("test.txt");
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
	}
	static void writeOutput(String str) {
	    try {
	        FileOutputStream fos = new FileOutputStream("test.txt");
	        Writer out = new OutputStreamWriter(fos, "UTF8");
	        out.write(str);
	        out.close();
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
