package com.company.java013_ex;



/*
연습문제2)
패키지명 : com.company.java013_ex 
클래스명 : AbstractEx002.java
다음과 같이 출력되게 main 코드를 작성하시오.
주어진 조건
1) 상속도 구조 
            Object
              ↑
        Astronaut { abstract explore(), report(), rest() }
   ↑            ↑               ↑ 
Engineer     Biologist       Pilot
{ @explore(), @explore(),    @explore(),
  @report(),  @report(),     @report(),
  @rest() }   @rest() }      @rest() }
  
- Astronaut는 추상 클래스이며, 모든 대원이 공통적으로 수행해야 할 기능을 설계함
- 각 대원 클래스는 Astronaut를 상속받아 기능을 구체적으로 구현함
- rest() 메서드는 각 대원의 고유한 휴식 방식 출력  

2) 코드
*/

abstract class Astronaut {
    protected String name; // 인스턴스변수 - 
    protected int stamina;

    public void setName(String name) { this.name = name; }
    public void setStamina(int stamina) { this.stamina = stamina; }
    public int getStamina() { return stamina; }

    abstract void explore();
    abstract void report();
    abstract void rest();
    
	@Override public String toString() { return "Astronaut [name=" + name + ", stamina=" + stamina + "]"; }
    
}

class Engineer extends Astronaut {
    @Override void explore() { System.out.println(name + " 엔지니어 탐사: 기계 장치 점검 완료!"); }
    @Override void report() { System.out.println(name + " 보고서: 에너지 시스템 안정적"); }
    @Override void rest() { System.out.println(name + " 휴식: 공구 정리하며 재충전 중..."); }
}

class Biologist extends Astronaut {
    @Override void explore() { System.out.println(name + " 생물학자 탐사: 외계 식물 샘플 채취!"); }
    @Override void report() { System.out.println(name + " 보고서: 생명체 흔적 발견"); }
    @Override void rest() { System.out.println(name + " 휴식: 생체 리듬 조절 중..."); }
}

class Pilot extends Astronaut {
    @Override void explore() {
        System.out.println(name + " 파일럿 탐사: 항로 재설정 및 우주선 조종!");
    }
    @Override void report() {
        System.out.println(name + " 보고서: 궤도 진입 성공");
    }
    @Override void rest() {
        System.out.println(name + " 휴식: 조종석에서 짧은 명상...");
    }
}

//////////////////////////////////////////////////////
public class AbstractEx002 {
    public static void main(String[] args) {
        // Astronaut astro = new Astronaut();  // Q1. 왜 객체 생성이 불가능한가?
    	  // A: Astronaut 내 abstract void explore()/report()/rest() 에 적용행위가 없어 객체 생성 불가

        System.out.println("\n--- 우주 탐사 대원 시뮬레이션 ---");
        Astronaut[] crew = { new Engineer(), new Biologist(), new Pilot() };
        String[] names = { "Nova", "Flora", "Jet" };
        int[] stamina = { 75, 60, 85 };

        // Q2. 체력이 낮은 대원만 휴식  70미만이 휴식을 취하게 만들기 
        //crew[0] = 1번지 Engineer{ explore(),report(),rest()} - Astronaut{name="Nova" ,stamina=75 /---, ---, ---};
        //crew[1] = 2번지 Biologist{ explore(),report(),rest()} - Astronaut{name="Flora" ,stamina=60 /---, ---, ---};
        //crew[2] = 3번지 Pilot{ explore(),report(),rest()} - Astronaut{name="Jet" ,stamina=85 /---, ---, ---};
		
          
        for (int i = 0; i < crew.length; i++) {
			crew[i].setName(names[i]);  // 이름셋팅
			crew[i].setStamina(stamina[i]); // 체력셋팅
			crew[i].explore();
			crew[i].report();
			if (crew[i].stamina < 70) {
				crew[i].rest();
			} else {
				System.out.println(crew[i].name + "는 충분한 체력을 유지중입니다.");
			}
			System.out.println();
		}
        
        
    }
}
//////////////////////////////////////////////////////