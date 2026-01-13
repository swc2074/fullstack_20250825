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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/***
 * 사용자 엔티티
 */
@Entity   //JPA 엔티티 선언
@Table( name= "FOLLOWS")
@Getter  @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Follow {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "follow_seq")  //시퀀스 사용
   @SequenceGenerator(name = "follow_seq", sequenceName = "FOLLOW_SEQ" , allocationSize = 1)
   @Column(name="APP_USER_ID")
   private Long id; //PK
   
   
   @Column(nullable = false , name="CREATED_AT")
   private LocalDateTime createdAt; // 생성일시
   
  
   
  
   @PrePersist
   void onCreate() { 
      this.createdAt = LocalDateTime.now();
   }
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "FOLLOWER_ID" , nullable = false)
   private AppUser follower;
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "FOLLOWEE_ID" , nullable = false)
   private AppUser followee;

   public Follow(AppUser follower, AppUser followee) {
	super();
	this.follower = follower;
	this.followee = followee;
   }
   
   

}










