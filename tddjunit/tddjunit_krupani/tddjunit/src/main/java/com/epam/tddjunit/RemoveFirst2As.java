package com.epam.tddjunit;

public class RemoveFirst2As {
	public String remove(String string) {
		// TODO Auto-generated method stub
		String result = "";
		int length = string.length();
		if(length >= 1 && string.charAt(0) != 'A')
			result += string.charAt(0);
		if(length >= 2 && string.charAt(1) != 'A')
			result += string.charAt(1);
		if(length >= 3)
			result += string.substring(2, length);
		return result;
	}
	
}
