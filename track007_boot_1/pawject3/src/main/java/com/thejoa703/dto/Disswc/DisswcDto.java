package com.thejoa703.dto.Disswc;
 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class DisswcDto {
	private int disno;
	private int userid;
	private String disname;
	private String disex;
	private String kindpet;
	private String infval;
	private String mannote;
	private int bhit;
    private String createdat;
    private String bip;
    private String bpass;
}
