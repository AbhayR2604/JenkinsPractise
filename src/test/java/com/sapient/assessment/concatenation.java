package com.sapient.assessment;


import org.testng.annotations.Test;

public class concatenation {
	
	@Test
	public void concatWords() {

		String firstName = "Abhay";

		String lastName = "Ram";
		System.out.println("Hello "+firstName+" "+lastName);
	}
}

