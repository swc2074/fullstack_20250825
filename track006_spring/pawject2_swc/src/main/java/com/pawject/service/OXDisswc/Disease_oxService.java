package com.pawject.service.OXDisswc;

import java.util.List;
import java.util.Map;

import com.pawject.dto.OXDisswc.OXDisDto;

public interface Disease_oxService {
	
	   public List<OXDisDto> selectAll(Map<String, Integer> params);
	   public  OXDisDto select(OXDisDto dto);
	   public  int insert(OXDisDto dto);
	   public  int update(OXDisDto dto);
	   public  int delete(OXDisDto dto);

}
