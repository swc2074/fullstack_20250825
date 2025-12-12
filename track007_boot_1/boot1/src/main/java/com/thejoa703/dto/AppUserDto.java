package com.thejoa703.dto;

import lombok.Data;

@Data
public class AppUserDto {
	private int appUserId;  //pk
	private String email;   //이메일 
	private String password;
	private Integer mbtiTypeId;
	private String createaAt;
	private String ufile;       //프로필이미지
	private String mobile;      //휴대폰
	private String nickname;
	private String provider;    //google,kakao, naver, local
	private String providerId;	//각provider의 고유 id

}
