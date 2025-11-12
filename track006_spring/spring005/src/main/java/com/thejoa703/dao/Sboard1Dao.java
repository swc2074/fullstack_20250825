package com.thejoa703.dao;

import java.util.List;

import com.thejoa703.dto.Sboard1Dto;

@MbtiDao
public interface Sboard1Dao {
	
	public int insert (Sboard1Dto dto);
	public int update (Sboard1Dto dto);
	public int delete (Sboard1Dto dto);
	public List<Sboard1Dto>  selectAll();
	public Sboard1Dto        select(int id);

}




/*--insert:
    insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
    values (sboard1_seq.nextval , 21, 'title', 'content', '1111', '127.0,0,1');
    
    insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
    values (sboard1_seq.nextval , 22, 'title22', 'content22', '2222', '127.0,0,1');
    
    insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
    values (sboard1_seq.nextval , 23, 'title33', 'content33', '3333', '127.0,0,1');
    
    insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
    values (sboard1_seq.nextval , 24, 'title44', 'content44', '4444', '127.0,0,1');
    
     insert into sboard1(ID , APP_USER_ID, BTITLE, BCONTENT, BPASS, BIP)
    values (sboard1_seq.nextval , 25, 'title44', 'content55', '5555', '127.0,0,1');
    
--selectAll
    select * from sboard1  order by id desc;

--select
   select * from sboard1 where id=4;
--update
   update sboard1
   set BTITLE='new14', BCONTENT='content1'
   where id=4 and BPASS='4444';

--delete
   delete from sboard1 where id=4 and BPASS='4444';

select * from sboard1;*/
