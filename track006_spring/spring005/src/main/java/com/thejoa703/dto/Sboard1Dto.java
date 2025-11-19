package com.thejoa703.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sboard1Dto {
	
	private int id;
	private int appUserId;
	private String btitle;
	private String bcontent;
	private String bpass;
	private String bfile;    // (default: 'no.png')
	private int bhit;         // BHIT (default: 0 )
	private String bip;
	//private LocalDateTime createdAt; CREATE_AT (default: SYSTIMESTAMP)
	private String createdAt;

}
