package com.simplilearn.strings;

public class stringBufferBuilder {
	
	public static void main(String[] args) {


		StringBuffer sb1 = new StringBuffer("Java");

		StringBuffer sb2 = new StringBuffer("Language");

		//sb2.reverse();

		System.out.println(sb2);

		System.out.println(sb1);
		System.out.println(sb2);

		sb1.append(sb2);


			System.out.println(sb1);

		String   s1 = new String("Sampath");	


		StringBuilder sbd1 = new StringBuilder(s1);

			String str2 = sb2.toString();
			// toString() converting obj into string


	}

}
