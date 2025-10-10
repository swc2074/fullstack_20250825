package com.company.java20251010_test;


class Score{
	 String name ;
	 int kor,eng ,math;
	double avg;
	String pass;
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass="
				+ pass + "]";
	}
	
}

class ScoreProcess{
	
	void process_avg(Score[] std) {
		for (int i = 0; i<std.length; i++) {
			std[i].avg = (std[i].kor + std[i].eng + std[i].math)/3.0;
		}
		
		}
	
	void process_pass(Score[] std) {
		for (int i = 0; i<std.length; i++) {
			if(std[i].avg >= 60)
				std[i].pass = "합격";
			else
				std[i].pass ="불합격";
		}
	}
	
}

class ScorePrint{
	void show(Score[] std){
		System.out.println("====================================================");
		System.out.print("이름\t국어\t영어\t수학\t평균\t합격여부\n");
		System.out.println("====================================================");
		for(int i=0; i<std.length;i++) {
			System.out.println(std[i]);
			}
	}
	
}



public class TestJava1010_05 {
	public static void main(String[] args) {
		
		Score[]std = new Score[3];
		std[0] = new Score("아이언맨",100,100,100);
		std[1] = new Score("헐크",90,60,80);
		std[2] = new Score("블랙팬서",20,60,90);
		
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint print = new ScorePrint();
		print.show(std);
		
	}

}
