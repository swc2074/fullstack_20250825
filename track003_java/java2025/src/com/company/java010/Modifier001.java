package com.company.java010;


// public> protected (extends) > default( 같은 폴더내에서만  > private (클래스안에서만 )


class UserSon1 extends UserInfo{
	public void show() {
		System.out.println(" 부이름     > " + super.name);               // 자식  - public
		System.out.println(" 부 금고번호 > " + super.safeCode);			// 자식 - protected
		System.out.println(" 부 집     > " + super.house);				// 자식 - package (같은 폴더에서)
		//System.out.println(" 부 IQ     > " + super.iQ);
		System.out.println(" 홍길도 아버비 IQ    > " + super.getiQ());
	}
	
}
/////////////////////////////////////////////
public class Modifier001 {

	public static void main(String[] args) {
		System.out.println("\n\n1. 홍길동 아버지 정보");  // 본인 :  public > protected > default > private (x)
		UserInfo user = new UserInfo();
		user.name = " 홍상직 ";   // public 아무데서나 접근 (홍길동씨 아버지)
		user.safeCode = "1234";  // protected 본인꺼 접근 가능
		user.house = " 전라남도장성군 ";
		//user.iQ    = 148;  // iQ cannot be resolved or is not a field
		user.setiQ(148);
		System.out.println(user.getiQ());
	}

}
////////////////////////////////////////////