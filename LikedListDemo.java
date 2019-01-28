package javapack;

import java.util.ArrayList;
import java.util.LinkedList;

public class LikedListDemo {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("B");
		System.out.println("No of elements:"+al.size());
		//al.remove("B");
		al.remove(3);
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
