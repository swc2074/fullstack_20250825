package com.pawjectTest001.ioc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//ver-1
//@Data
//ver-2
@Data @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
//NoAllArgsConstructor
@AllArgsConstructor

public class DITest2 {
	private String name;
	private int age;

}
