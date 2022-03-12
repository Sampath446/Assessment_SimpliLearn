package com.simplilearn.ClassDemo;

public class PremitiveDemo {
	
	static int id;
	static String name;   //instance var
	
		public static void main(String[] args) {
			
			
			int  x =100;
			String str;
	
				System.out.println(x);
			
				PremitiveDemo   p = new PremitiveDemo();
				
				System.out.println(p.id);
				System.out.println(PremitiveDemo.name);
			
				p.add(4,3);
			
		}
		
		public int  add(int a,int b) {
			
			
			return a+b;
		}

}
