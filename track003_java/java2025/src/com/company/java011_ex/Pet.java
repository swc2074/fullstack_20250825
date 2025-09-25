package com.company.java011_ex;



public class Pet {
	
	   private String name;  
	   private int walkTime, snackCount, cuddleCount, moodScore;  
	   private String snackStars, tailWag, todayMessage;
	   
	   public Pet() {
	   }
	   
	   public Pet(String name, int walkTime, int snackCount, int cuddleCount
			) {
		
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
			System.out.printf("%-8s\t%-10s\t%-10s\t%-10s\t%-8s\t%-10s\t%-12s\t%-12s\t",
					"이름","산책시간","간식개수","쓰다듬횟수","행복도","간식보상","꼬리흔들기","오늘의멘트");
			System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
	   public void show() {
		   process_moodScore 	();
		   process_snackStars	();
		   process_tailWag	();
		   process_todayMessage	();
			
			
			System.out.printf("%-8s\t%-10d\t%-10d\t%-10d\t%-8d\t%-10s\t%-12s\t%-12s\n",
					this.name,this.walkTime,this.snackCount,this.cuddleCount,this.moodScore,this.snackStars,this.tailWag,this.todayMessage);
			}
	   
	// 
		public void process_moodScore 	() {
			moodScore = walkTime + (snackCount * 10) + (cuddleCount * 5);
			}
		
		
		public void process_snackStars	() {
			if(moodScore >=90) snackStars = "★★★★★";
			else if (moodScore >= 70) snackStars = "★★★★";
			else if (moodScore >= 50) snackStars = "★★★";
			else if (moodScore >= 30) snackStars = "★★";
			else  snackStars = "★";
			
		}
		
		public void process_tailWag	() {tailWag = moodScore> 90 ? "흔들흔들흔들" : moodScore > 60 ? "흔들흔들": 
			                            moodScore > 40 ? "살짝 흔들" : "꼬리내림";}
		
		public void process_todayMessage	() {todayMessage = moodScore> 90 ? "오늘은 정말행복했어요!" : moodScore > 60 ? "좋은하루였어요!": 
            moodScore > 40 ? "조금 더  놀아줘요!" : "외로웠어요";}
		
		
	   
	   
	   
	   
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
