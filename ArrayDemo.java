package javapack;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		System.out.println("No of elements in a:"+a.length);
		int b[]=new int[5];
		System.out.println("No of elements in b:"+b.length);
		b[0]=10;
		b[2]=30;
		System.out.println("3rd element in b:"+b[2]);
		System.out.println(Arrays.equals(a, b));

	}

}
