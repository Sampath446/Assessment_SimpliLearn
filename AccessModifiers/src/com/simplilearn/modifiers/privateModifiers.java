package com.simplilearn.modifiers;

public class privateModifiers {
	
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 

		public static void main(String[] args) {
			//private
			System.out.println("Private Access Specifier");
			privateModifiers  obj = new privateModifiers();
	        //trying to access private method of another class 
	        obj.display();

		}
		
	}
	


