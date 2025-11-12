package com.thejoa703.dao;

import java.util.List;

import com.thejoa703.MyDao;
import com.thejoa703.dto.UserInfoDto;

@MyDao
public interface UserinfoDao {
	//userifno-mapper 참조

	//<insert id="insert" parameterType="com.thejoa703.dto.UserInfoDto">
	public int insert(UserInfoDto dto);
	
	//<select resultType="UserInfoDto" id="selectAll">
	public List<UserInfoDto> selectAll();
	
	//<select resultType="UserInfoDto" id="select" parameterType="int">
	public UserInfoDto select(int no);
	
	//<update id="update" parameterType="UserInfoDto">
	public int update(UserInfoDto dto);
	
	//<delete id="delete" parameterType="int">
	public int delete(int no);

}
