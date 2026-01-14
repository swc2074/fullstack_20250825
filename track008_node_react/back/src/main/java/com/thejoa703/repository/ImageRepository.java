package com.thejoa703.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thejoa703.entity.Images;


@Repository
public interface ImageRepository extends JpaRepository<Images, Long> {// Entity, PK

}

/*
CREAT: save - INSERT INTO appuser (컬럼1, 컬럼2,,) values (?,?,,)
READ : findAll - select * appuser 
       findById - select * from appuser where id=?
UPDATE: save - update appuser  set 컬럼1=? , 컬럼2=? where id=?
DELETE: deleteById - delete from appuser where id=?
*/