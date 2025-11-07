package com.company.ex2;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
//NoAllArgsConstructor
@AllArgsConstructor
public class UserInfo {
	
	private int no;
	private String name;
	private int age;

}
