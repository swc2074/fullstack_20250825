package com.company.java011;

// 1. 클래스는 부품 객체
// 2. 클래스는 상태 (멤버변수)와 해위(멤버함수)


import com.company.java011_ex.Score;

public class ModifierEx3{
public static void main(String[] args) {
    Score iron = new Score();     
    Score hulk = new Score("hulk" , 20,50,30);    
    
    // Score.info()위에 메서드작성해주세요!  ##
    // setter를 이용해주세요!
    iron.setName("iron"); iron.setKor(100); iron.setEng(100); iron.setMath(100);
    
    Score.info();     // 클래스메서드
    iron.show();          
    hulk.show();   
 }


}
