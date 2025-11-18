package com.thejoa703.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AppUserDto {
	private int appUserId;
	private String email;
	private String password;
	private int mbtiTypeId;
	private int bhit;
	private String bip;
	private java.sql.Timestamp createdAt;

}
