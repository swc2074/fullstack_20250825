package com.company.java011_ex;

public class Score {
	// 멤버변수 (private - getters/setters)
	private String name; // 인스턴스변수 - heap area
	private int kor, eng, math, total;
	private double aver;
	private String p, s, rank;

	// 멤버함수 (all + shift + s/ alt + s/ 2,3,4 , getters/setters
	// 1. 생성자 (default / name, kor, eng, math / all arg )

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	
	}

	// 2. 상태확인 (toString)
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";
	}
	// 3. getters/setters

	// 4. Score.info(){} [공용] public static 클래스명.메서드명(){}
	public static void info() {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t",
				"이름","국어","영어","수학","총점","평균","합격여부","장학생","랭킹");
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	// 5. iron.show(); hulk.show(); [각각, this] 인스턴스 메서드
	public void show() {
		process_total 	();
		process_avg		();
		process_p		();
		process_s 		();
		process_rank	();
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-10s\n",
				this.name,this.kor,this.eng,this.math,this.total,this.aver,this.p,this.s,this.rank);
		
	}

	// 6. total 총점함수, ave 평균함수, p 합격여부함수, s 장학생함수, rank * 별체크함수 (etc)
	public void process_total 	() {this.total = this.kor + this.eng + this.math;}
	public void process_avg		() {this.aver = this.total/3.0;}
	public void process_p		() {this.p	 = this.aver<60? " 불합격 " :
		                                     this.kor<40 || this.eng<40 || this.math<40 ? "재시험" : "합격";}
	public void process_s 		() {this.s = this.aver<95 ? " " : "장학생";}
	public void process_rank	() {this.rank = " "; for (int i=0; i<(int)(this.aver/10); i++) {
		this.rank+= "★";}
	}
	
		// java010_ex에 설정해 주세요!
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAver() {
		return aver;
	}

	public void setAver(double aver) {
		this.aver = aver;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	
	

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Score() {
		
	}

	

} // java011_ex에 설정해주세요!