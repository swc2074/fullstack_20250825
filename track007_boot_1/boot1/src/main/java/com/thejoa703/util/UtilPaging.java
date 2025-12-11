package com.thejoa703.util;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UtilPaging {
	
	   private  int  listtotal;    //전체
	   private  int  onepagelist;  //한페이지에 보여줄 게시물의 수
	   private  int  pagetotal;    //총페이지 
	   private  int  bottomlist;   //하단에 페이지수   이전   11,12,13,14,15다음
	   private  int  pstartno;     //페이지 시작번호 (1) 1,2
	   
	   private  int current;       //하단에 페이지수       11,12,[13],14,15
	   private  int start;        //하단에 페이지수 이전   [11]
	   private  int end;   		// 하단에 페이지수  이전   [20]
	   
	   public UtilPaging(int listtotal, int pageNo) {
		  
		   this.listtotal= (listtotal <= 0)? 1: listtotal;
		   this.onepagelist=10;
		   this.pagetotal  = (int) Math.ceil(this.listtotal/(double )onepagelist);
		   //193/10 -> 19.3 -> 올림 -> 20
		   //200/10 -> 20   -> 올림 -> 20
		   this.bottomlist = 10;
		   this.current = pageNo; // 23 -> start =21, end =30
		   this.start   = ((current-1)/bottomlist)*bottomlist +1;
		   // 21 -> (21-1)/10 -> 앞자리 2로   *10+1
		   // 30 -> (30-1)/10 -> 앞자리 2로   *10+1
		   this.end     = start + bottomlist-1;
		   if(end>pagetotal) {end=pagetotal; } //30>26 마지막은 26번으로 
		   
	   }
	

}
