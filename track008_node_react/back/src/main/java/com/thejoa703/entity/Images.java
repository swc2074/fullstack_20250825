package com.thejoa703.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
// JPA관련 어노테이션
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/***
 * 게시글 엔티티
 */
@Entity   //JPA 엔티티 선언
@Table(name= "IMAGES")
@Getter  @Setter 
public class Images {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "image_seq")  //시퀀스 사용
   @SequenceGenerator(name = "image_seq", sequenceName = "IMAGE_SEQ" , allocationSize = 1) 
   private Long id; //PK
   
   
  
   @Column(length=200, nullable = false)
   private String src;  
   
   
  
   
   @ManyToOne // 한글은 여러 이미지를 갖는다.
   @JoinColumn(  name="POST_ID" , nullable=false ) // POST_ID는 외래키(FK), Post엔티티의 PK(id) 참조
   private Post post;   // 작성자 (AppUser와 N:1 관계)
   
}









