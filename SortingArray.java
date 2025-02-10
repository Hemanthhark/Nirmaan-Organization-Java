package day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArray {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(19);
		list.add("Hemanth");
		list.add(16);
		System.out.println(list);
		
		
		System.out.println(list);
		
		ArrayList<Integer> int1=new ArrayList<Integer>();
		ArrayList<String> str1=new ArrayList<String>();
		
		for(Object obj:list) {
			if(obj instanceof Integer) {
				int1.add((Integer) obj);
				System.out.println(int1);
				
				
			}else if(obj instanceof String) {
				str1.add((String)obj);
			}
			
		}
		
		Collections.sort(int1);
		System.out.println(int1);
	
		System.out.println(str1);
		
		list.clear();
		list.addAll(int1);
		list.addAll(str1);
		System.out.println(list);
		
	}

}
