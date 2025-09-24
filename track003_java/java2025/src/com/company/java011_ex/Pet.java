package com.company.java011_ex;

public class Pet {
	
	private String name;  
	   private int walkTime, snackCount, cuddleCount, moodScore;  
	   private String snackStars, tailWag, todayMessage;
	   public Pet() {
		super();
		// TODO Auto-generated constructor stub
	   }
	   public Pet(String name, int walkTime, int snackCount, int cuddleCount
			) {
		super();
		this.name = name;
		this.walkTime = walkTime;
		this.snackCount = snackCount;
		this.cuddleCount = cuddleCount;
	
	   }
	   @Override
	   public String toString() {
		return "Pet [name=" + name + ", walkTime=" + walkTime + ", snackCount=" + snackCount + ", cuddleCount="
				+ cuddleCount + ", moodScore=" + moodScore + ", snackStars=" + snackStars + ", tailWag=" + tailWag
				+ ", todayMessage=" + todayMessage + "]";
	   }
	   
	   public static void info() {
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t",
					"이름","산책시간","간식개수","쓰다듬횟수","행복도","간식보상","꼬리흔들기","오늘의 멘트");
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
	   public void show() {
		   process_moodScore 	();
			process_avg		();
			process_p		();
			process_s 		();
			process_rank	();
			System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-10s\n",
					this.name,this.walkTime,this.snackCount,this.cuddleCount,this.moodScore,this.aver,this.p,this.s,this.rank);
	   
	// 6. total 총점함수, ave 평균함수, p 합격여부함수, s 장학생함수, rank * 별체크함수 (etc)
		public void process_moodScore 	() {this.moodScore = this.walkTime + (this.snackCount * 10) + (this.cuddleCount * 5);}
		public void process_avg		() {this.aver = this.total/3.0;}
		public void process_p		() {this.p	 = this.aver<60? " 불합격 " :
			                                     this.kor<40 || this.eng<40 || this.math<40 ? "재시험" : "합격";}
		public void process_s 		() {this.s = this.aver<95 ? " " : "장학생";}
		public void process_rank	() {this.rank = " "; for (int i=0; i<(int)(this.aver/10); i++) {
			this.rank+= "★";}
		}
	   
	   
	   
	   
	   public String getName() {return name;}
	   public void setName(String name) {this.name = name;}
		   
	   public int getWalkTime() {
		   return walkTime;
	   }
	   public void setWalkTime(int walkTime) {
		   this.walkTime = walkTime;
	   }
	   public int getSnackCount() {
		   return snackCount;
	   }
	   public void setSnackCount(int snackCount) {
		   this.snackCount = snackCount;
	   }
	   public int getCuddleCount() {
		   return cuddleCount;
	   }
	   public void setCuddleCount(int cuddleCount) {
		   this.cuddleCount = cuddleCount;
	   }
	   public int getMoodScore() {
		   return moodScore;
	   }
	   public void setMoodScore(int moodScore) {
		   this.moodScore = moodScore;
	   }
	   public String getSnackStars() {
		   return snackStars;
	   }
	   public void setSnackStars(String snackStars) {
		   this.snackStars = snackStars;
	   }
	   public String getTailWag() {
		   return tailWag;
	   }
	   public void setTailWag(String tailWag) {
		   this.tailWag = tailWag;
	   }
	   public String getTodayMessage() {
		   return todayMessage;
	   }
	   public void setTodayMessage(String todayMessage) {
		   this.todayMessage = todayMessage;
	   }  

	   
	   
}
