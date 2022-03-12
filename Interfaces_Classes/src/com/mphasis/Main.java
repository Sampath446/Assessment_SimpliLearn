package com.mphasis;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		
			Object o = (Object) new Child();  // runtime polymorphism
		
		Parent p = new Parent();	
		
		// Child c = new Child();
		Child c = (Child) o;
		System.out.println(c);
		
		String str = new String();
		
		Object obj = str; 
		
		String str2 = (String) obj;		 
		
	}
	

}
