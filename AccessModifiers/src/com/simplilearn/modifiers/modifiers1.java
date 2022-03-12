package com.simplilearn.modifiers;

public class modifiers1 {
	
	void display() {
		
		System.out.println("This is a Default modifier");
		
	}
	
	public static class DefaultAccessModifiers {
		
		public static void main(String[] args) {
			
			modifiers1 m = new modifiers1();
			m.display();
			
		}
	}
	
}


