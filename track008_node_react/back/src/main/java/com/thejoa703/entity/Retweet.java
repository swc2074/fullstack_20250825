package com.thejoa703.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
// JPA관련 어노테이션
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/***
 * 사용자 엔티티
 */
@Entity   //JPA 엔티티 선언
@Table( name= "RETWEETS",
		uniqueConstraints = @UniqueConstraint(
		   name="UK_APPUSER_USER_ORIG" ,   
		   columnNames = {"APP_USER_ID" , "ORIGINAL_POST_ID"}
		)
)
@Getter  @Setter @NoArgsConstructor 
public class Retweet {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "retweet_seq")  //시퀀스 사용
   @SequenceGenerator(name = "retweet_seq", sequenceName = "RETWEET_SEQ" , allocationSize = 1)
   
   
   private Long id; //PK
   
   @Column(nullable = false , name="CREATED_AT")
   private LocalDateTime createdAt; // 생성일시 (리트윗 시점)
   
   
   @ManyToOne
   @JoinColumn(name = "APP_USER_ID" , nullable = false)
   private AppUser user; // 리트윗한 사람
   
   @ManyToOne
   @JoinColumn(name = "ORIGINAL_POST_ID" , nullable = false) // APP_USER_ID는 외래키
   private Post originalPost; // 원본 게시글

   @PrePersist
   void onCreate() {
      this.createdAt = LocalDateTime.now();
      
   }

   public Retweet(AppUser user, Post originalPost) {
	super();
	this.user = user;
	this.originalPost = originalPost;
   }

  

}










