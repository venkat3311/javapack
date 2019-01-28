package javapack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream("E:\\Selenium_Scripts\\Test Data\\Google.xlsx");
		System.out.println("Pass");

	}

}
