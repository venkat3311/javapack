package javapack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		System.out.println("No of elements:"+al.size());
		//al.remove("B");
		for(String s:al)
		{
			System.out.println(s);
		}
		
		/*Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/

	}

}
