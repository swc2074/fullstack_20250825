package com.pawject.dao.Disswc;

import java.util.List;
import java.util.Map;

import com.pawject.dto.Disswc.DisswcDto;




public interface DiseaseDao {
	public int insert(DisswcDto dto);
	public int update(DisswcDto dto);
	public int delete(int disno);
//	public List<DisswcDto>   selectAll();
	
	public DisswcDto	     select(int disno);
	public List<DisswcDto> selectAll(Map<String, Object> params);

}
