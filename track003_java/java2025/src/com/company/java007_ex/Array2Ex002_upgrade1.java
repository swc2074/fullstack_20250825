package com.company.java007_ex;

public class Array2Ex002_upgrade1 {
	public static void main(String[] args) {
		
		int[][] arr2 = {
				{101,102,103},{200,201,202},{301,302,303}
		};
		
		for (int ch=0;ch<arr2.length;ch++) {
			for (int kan=0;kan<arr2[ch].length; kan++) {
				if ((arr2[ch][kan])%2 == 0) {
					System.out.print("짝수" + "arr2["+ch + "][" + kan +"]" + "=" + arr2[ch][kan]+"\n");
				}
			}
		}
	}

}
