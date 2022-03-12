package com.simplilearn.ClassDemo;

import java.util.*;

public class newClassObj extends Object {
	
	public newClassObj() {
	
	System.out.println("Demo object created..");
	}
public newClassObj(int x) {
		
		
	}
	
	
	public static void main(String[] args) {
		

		
		newClassObj demo =	  new  newClassObj();
				  
		String str =	  new String("sam");
			
		int  eid = 101;
			
		System.out.println(eid); //101
			
			
		System.out.println(demo); //hashcode

		
		System.out.println(str.toString());
			
	}

}
	

	
