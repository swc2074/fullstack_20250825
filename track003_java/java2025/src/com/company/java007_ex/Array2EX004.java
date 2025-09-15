package com.company.java007_ex;

public class Array2EX004 {

	char[][] chars = new char[2][3];

	char data = 'A';

	for(
	int ch1 = 0;ch<chars.length;ch++)
	{
		for (int kan = 0; kan < chars[ch1].length; kan++) {
			chars[ch1][kan] = data++;
		}
	}

	for(
	int ch = 0;ch<chars.length;ch++)
	{
		for (int kan = 0; kan < chars[ch1].length; kan++) {
			System.out.print(chars[ch1][kan] + " ");
		}
	}
	}

}
