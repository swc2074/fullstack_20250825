package com.thejoa703.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thejoa703.entity.AppUser;


@Repository //★
public interface AppUserRepository extends JpaRepository<AppUser, Long> {// Entity, PK ★
	//email + provider로 사용자 조회
	Optional<AppUser> findByEmailAndProvider(String email, String provider);
	Optional<AppUser> findByEmail(String email);
	
	
	//닉네임 중복
	long countByNickname(String nickname);
	default boolean existsByNickname(String nickname) {
		return countByNickname(nickname) >0;
	}
	
	
	long countByEmail(String email);
	default boolean existsByEmail(String email) {
		return countByEmail(email) >0;
	}
	//email 중복
}

/*
CREAT: save - INSERT INTO appuser (컬럼1, 컬럼2,,) values (?,?,,)
READ : findAll - select * appuser 
       findById - select * from appuser where id=?
UPDATE: save - update appuser  set 컬럼1=? , 컬럼2=? where id=?
DELETE: deleteById - delete from appuser where id=?




            사용자    관리자
create      ◎회원가입   ◎회원가입
read        로그인, 이메일중복, 닉네임중복, (페이징이 들어간 유저조회)
update      ◎닉네임수정, ◎이미지수정
delete      ◎회원탈퇴
*/
