package com.company.java0912;

public class Q20250912Test_5 {
	public static void main(String[] args) {
		// 변수

		int[] nums = new int[3];
		int data = 10;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = data;
			data += 10;

		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");

		}
	}

}
