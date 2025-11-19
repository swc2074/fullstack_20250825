package com.thejoa703.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.thejoa703.dto.Sboard1Dto;

public interface Sboard1Service {

	public int insert (Sboard1Dto dto); // board update 기능
	public int update (Sboard1Dto dto); // board update 기능
	public int delete (Sboard1Dto dto); // board update 기능
	public List<Sboard1Dto>  selectAll(); // board 전체
	public Sboard1Dto        select(int id); // board 상세보기 (조회수 올리기  ●+ 해당글 가져오기)
	public Sboard1Dto        selectUpdateForm(int id);
	
	/*upload*/
	public int insert2 (MultipartFile file, Sboard1Dto dto); 
	public int update2 (MultipartFile file, Sboard1Dto dto);
	
	/* Search - Ajax */
	public List<Sboard1Dto>  selectSearch(String keyword);
}


//package com.thejoa703.service;
//
//import java.util.List;
//import com.thejoa703.dto.Sboard1Dto;
//
//public interface Sboard1Service {
//   public int insert(Sboard1Dto dto);   // board insert 기능
//   public int update(Sboard1Dto dto);   // board update 기능
//   public int delete(Sboard1Dto dto);   // board delete 기능
//   public List<Sboard1Dto>  selectAll();// board 전체
//   public Sboard1Dto        select(int id); // board 상세보기 ( 조회수올리기 ● + 해당글가져오기 )
//   public Sboard1Dto        selectUpdateForm(int id);
//}
