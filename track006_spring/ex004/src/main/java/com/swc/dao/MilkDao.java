package com.swc.dao;

import java.util.List;

import com.swc.dto.MilkDto;

@MyDao
public interface MilkDao {
	public int insert(MilkDto dto);
	public int update(MilkDto dto);
	public int delete(int mno);
	public MilkDto select(int mno);
	public List<MilkDto> selectAll();

}

//create table milk(
//mno number not null primary key,
//mname varchar2(100) not null unique,
//mnum number not null,
//mtotal number
//);
//
//select * from milk;
//create SEQUENCE milk_seq;
//desc milk;
//       
//insert into milk(mno,mname,mnum,mtotal) 
//          values(milk_seq.nextval,  'white'   , '1', '1000'  );  
//          
//        
//            
//select * from milk where no = 1;
//update milk set nname='name3' where mno=1;
//update milk set mname='banana', mnum=1, mtotal=2000 where mno=2;
//delete from milk where mno=1;
//
//alter table milk rename column nname to mname;
//alter table milk rename column nnum to mnum;