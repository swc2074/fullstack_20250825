package com.company.java010_ex;



//Q1. public > protected (extended)> default (같은 폴더 안에서만) > private ( 클래스 안에서만 )

 class ToyBox{
	public String sharedToy = "블록";
	private String secretToy = "로봇";
	        String familyToy = "퍼즐";
}




/////////////////////////////////////////////
public class ModifierEx001 {

	public static void main(String[] args) {
		ToyBox box = new ToyBox();
		System.out.println(box.sharedToy); // o  블록 친구가 볼수 있는 코드
		//System.out.println(box.secretToy);// x 
		System.out.println(box.familyToy); // o  퍼즐

	}

}
////////////////////////////////////////////////