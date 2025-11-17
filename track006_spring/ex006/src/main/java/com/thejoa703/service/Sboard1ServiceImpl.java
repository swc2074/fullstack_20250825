package com.thejoa703.service;

import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejoa703.dao.AppUserDao;
import com.thejoa703.dto.AppUserDto;

@Service
public class Sboard1ServiceImpl implements Sboard1Service {

	@Autowired AppUserDao dao;
	  public int insert(AppUserDto dto) {
		  try {dto.setBhit( InetAddress.getLocalHost().getHostAddress() );
	  
	  }catch(UnknownHostException e) { e.printStackTrace();
	  
	  } return dao.insert(dto);
	  
	  }
	
	

	public List<AppUserDto> selectAll() {
		return dao.selectAll();
	}

	public AppUserDto select(int id) {
		return dao.select(id);
	}

	public AppUserDto selectUpdateForm(int id) {
		return dao.select(id);
	}

	public int update(AppUserDto dto) {
		return dao.update(dto);
	}

	public int delete(AppUserDto dto) {
		return dao.delete(dto);
	}

	

	

	
}
