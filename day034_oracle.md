#1. 저장단위
변수 < 배열< 클래스 <콜렉션프레임워크 >file > DB
※ DB (mysql, oracle, mssql)
>java : jdbc -> dbcp -> orm(mybatis, jpa)

#2. RDB(Relational Database)  ★
   관계형 데이터 베이스
   테이블 관계
1. 엔티티(Entity) - 테이블 - 관리할 대상 (고객, 주문, 상품)
2. 속성(Attribute) - 컬럼 - 대상의 특징 (주민번호, 이름, 나이)
3. 관계(Relationship) - 외래키 - 대상간의 연결 - 고객은 주문을 한다.

#3.  데이터베이스 언어  ★
1. 정의어(DDL) - create, alter, drop .... cad
2. 조작어(DML) - insert(삽입), select(조회), update(수정), delete(지우기).... crud
3. 제어어(DCL) - grant, revoke

<<사원>>
SQL> desc emp;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)

 <<부서>>
 desc dept;
  Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)

 >부서는 많은 사원을 가질수 있다. 
 관리대상(table)  : dept   emp
 속성(attribute)  : deptno   empno, deptno, , ,
 연결(Relationship): deptno

 [실습]
 1. 테이블 구조확인 : desc emp
 

 # 자바
 # 깃허브(협업)
 # oracle
 # 네트워크관리사 - 이론(2) / 실기


## Track001 -  github

 
# ■ Github   
### 12. 깃허브 협업 
---
1. html + css + js/jquery      [개인]
2. spring + mybatis + jstl     
3. node + react
4. spring boot + thymeleaf + jpa + mybatis + react  
5. flutter + spring boot + jpa + mybatis + react
 

 ■ 1. basic
 #1. 가방에 담기 (불꽃마법재료, 불씨, , ,)
 git add . 
 #2. 가방에 메시지남기기 ( 불꽃 마법완성)
 git commit -m "메시지"

 #3. [공용-github - 마법책] 같은 마법책을 쓰니깐 서로 바뀐거 확인
 git pull origin master

 #4. [공용으로 쓰는 마법책] 에 불꽃마법 올리기 (공유)
 git push origin master

■ 2. 깃협업
1. 팀원초대
2. 협업 중 같은 파일를 수정하면서 생기는 충돌(conflict) 해결

```
#1. 팀장 - 팀원초대 (github 웹)
#2. 팀원 - repository 클론
git clone 깃허브주소

#3. 팀원 - branch
    git checkout -b branch명

#4. 팀원 - 파일작성
git add . 
git commit -m "message"
git pull origin master 
git push origin master

※ 충돌 - HEAD, =============, >>>>>>>>>>>>>>> / 코드수정

Q1. 팀장 - test2.md 파일 만들기 > 안녕하세요 포젝트입니다. 
Q2. 팀원 - test2.md           > 안녕하세요. 팀원 ** 입니다. 

   충돌시 
   안녕하세요 포젝트입니다. 
   팀장: 세상에서 젤로 멋찐 홍길동 입니다. 
   팀원: 세상에서 젤로 귀여운 가길동 입니다. 

   ........................................

##### ■ 3. merge vs rebase
1. 기능 브랜치에서 작업 중 main 브랜치가 업데이트가 된 경우
> 여러 마법사가 함께 주문서를 쓰고있을때
- 내가 주문을 다시쓰면 친구들의 주문이 사라 질수 있음.

★ 브랜치 꼭확인!

#1. 불꽃마법사가 본인코드 작성중
   git add spell2.md
   git commit -m "불꽃마법2 추가"

#2. 메인 마법서가 업데이트가 됨. 
    불꽃마법사가 최신 마법서위에 자신의 주문을 다시 써야 함.

    git checkout master
    git pull origin master
    git checkout dev-f

    # 최신 마법서위에 주문 다시 쓰기   
    git checkout dev-f
    git rebase master
    # > master 브랜치기준으로 내작업을 다시 정렬
    git rebase main   # 주문이 겹쳐서 마법서 충돌남. 어떤 주문 쓸지 선택 / 수정완료 

    git add spell2.md
    git rebase --continue


    # 안전하게 주문서 공유
    git push --force-with-lease


```
#### 4. fetch vs merge
- fetch : 데이터 가져오기 (충돌이 날지 먼저 확인)
- pull : 데이터 가져오고 바로 합치기 (위험의 가능성)

```bash
#1. [github] test.md 새로운 사항 업데이트
#2. [local] 작업 - 새로운 변경사항있는지 확인
 git fetch origin
#3. 가져온 변경사항 확인
 git log adiddldll  
 git log HEAD..origin/master
 git diff HEAD origin/master --변경된 내용파일 확인
#4. 확인후 합치기

 git merge orgin/master
```


.................................................
Q1. 팀장 - [깃허브] test2.md 수정
   -★ 자격증 공부
   -day001 이론완료 : 이름붙여주기

Q2. 팀원 - [깃허브] test2.md 수정
   - git pull 이 아니라 get fetch 데이터 가져오기



   #### 4. restore vs checkout
   - restore : 파일을 예전상태로 되돌리는 기능 (최근 상태로 되돌리기), commit 안했을때 사용가능
   - checkout : 브랜치 바꾸거나 파일 되돌리기

```bash
git restore 파일명 #마지막으로 저장상태로 돌아감.
git restore --source=HEAD~1 파일명  #HEAD~ 1 1단계  #HEAD~2 2단계
``` 
##### ■4. fetch  vs  pull
- fetch : 데이터 가져오기 ( 충돌이 날지 먼저 확인 ) 
- pull  : 데이터 가져오고 바로 합치기 (위험의 가능성)

```bash
#1. [ github ]  test.md  - 새로운 사항 업데이트
#2. [local] 작업 - 새로운 변경사항있는지 확인
   git fetch  origin
#3. 가져온 변경사항 확인
   git log     a1dc3bc..36ff096
   git log     HEAD..orgin/master
   git diff    HEAD  origin/master  -- 변경된 내용파일
   git diff -- HEAD  origin/master 
#4. 확인후 합치기 
   git merge orgin/master   
..............................
Q1. 팀장 - [깃허브] test2.md  
    ★ 자격증 공부
    - day001 이론완료 : 이름붙여주기
    
Q2. 팀원 - [깃허브] test2.md 수정 
    -  git pull 이 아니라 get fetch 데이터 가져오기  
##### ■4. restore  vs  checkout
- restore  : 파일을 예전 상태로 되돌리는 기능  (최근상태로 되돌리기) , commit 안했을때사용가능
- checkout : 브랜치 바꾸거나 파일 되돌리기

``` bash
git restore  파일명   # 마지막으로 저장한상태로 돌아감.
git restore   --source=HEAD~1  파일명   # HEAD~1  1단계  , HEAD~2  2단계
```

### restore 1단계

# ■ JAVA
# ■ Java 복습문제
# ■ JAVA
# ■ JAVA 복습문제
복습문제1)  [note]  이론  
```			
1. interface의 멤버변수는 __(1)상수__이고, 멤버함수는 __(2)추상메서드__로 이루어진 설계 클래스이다.
		  public static final		   public abstract
2. abstract와 interface의 차이점은 __(3)추상화__의 정도인데, __(4)인터페이스__가 더 크다.
3. 콜렉션 프레임워크는 __(5)배열__의 단점을 보완하고자 나온 __(6) 동적배열__이다.
4. List의 특징은 __(7)순번-index__이 있고, __(8)중복허용__이 가능하다.
5. 사용할 수 있는 메서드의 종류는 __(9) add __, __(10) get __, __(11)size__, __(12)remove__, __(13)contains__이다.
```
 

복습문제2) [note]
Q1. 상속도를 그리시오.
Q2. Driver 클래스를 작성하시오.  
/*
          Vehicle  {run()}
   ......△	         ......△	
MotorCycle       Car 
 {@run()}           {@run()}

1) 부모 = 자식  업캐스팅 / 타입캐스팅 X / 한가지(부모) 타입으로 여러객체(자식)를 관리
				  부모에서 메서드호출시 자식메서드	
*/

interface Vehicle { public void run();  } 
class MotorCycle implements Vehicle {
	@Override  public void run() { 	System.out.println("오토바이가 달립니다.");    }
}
class Car implements Vehicle {
	@Override   public void run() {	System.out.println("자동차가 달립니다.");     }
}
```answer
class Driver { void drive(Vehicle  v){   v.run(); }}
```
public class Oop014_method_polymorphism {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Car();
		MotorCycle mo = new MotorCycle();
		// 리턴값 메서드명(){  해야할일 - 자동차가 달립니다. / 오토바이가 달립니다.}
		// void drive(Vehicle  v){   v.run(); }
		driver.drive(car);   // 자동차가 달립니다.
		driver.drive(mo);  // 오토바이가 달립니다.
	} 
}
 
 

복습문제3) [eclipse]
클래스명 : Repeat029
다음과 같이 코드를 작성하시오.
 1.  ArrayList이용해서 colors 만들기   
 2. red, green, blue 데이터 추가    
 3. 출력

 
■ Bank
◎1. 시스템개요
프로젝트명 : Bank Management System
목적      : 사용자 계좌관리 기능을 제공하는 콘솔기반 은행시스템
기능      : 계좌생성, 입금, 출금, 계좌삭제, 로그인
기술스택   : 
- 사용언어 : Java
- 설계패턴 : MVC 
- UML    
특징      : 객체지향 원칙준수, 확장성 높은 구조

◎2. 클래스구조 설명
- MVC (Model , View, Controller)
1. [model] 유저정보모델 : <<class>> UserInfo
   - 사용자 계좌정보를 저장하는 데이터 모델
   - String id, String pass, double balance
   - ArrayList<UserInfo> users;

2. [controller] 기능 : 인터페이스& 클래스 
인터페이스 : 공통동작정의
   <<interface>> BankController {  exec(ArrayList<UserInfo> users); }

구현클래스 
<<class>>   Login, Add, Deposit, Widthdraw, Delete   

3. 메인컨트롤러 
<<class>> Bank_Main     
멤버변수 :   ArrayList<UserInfo> users , BankController controller
멤버함수 :   menu() , main()


◎3. UML 클래스 다이어그램 
Bank_Main  →  UserInfo <연관관계>
Bank_Main  →  BankController  <의존관계>
BankController ←  Login, Add, Deposit, Widthdraw, Delete   <실체화관계>


<<interface>> BankController  
...△   ...△  ...△    ...△     ...△    ...△
Login, Add, Deposit, Widthdraw, Delete,  Show()  


Bank_Main  →  UserInfo <연관관계>  실선화살표 - 멤버변수로 포함
Bank_Main  →  BankController <의존관계>  점선화살표 - 인터페이스를 일시적으로 사용, 
                                                   Login, Add 교체해서 사용


참고1)
※ 연관관계  :  어떤역할 수행(long)     - 실선 화살표
※ 의존관계  :             (short)    - 점선 화살표
※ 실체화관계 : 인터페이스와 구현클래스 - 속이빈화살표 점선  -  can do this  

※ 일반화관계 : 상속                 - 속이빈화살표 실선  -  is a  
※ 집합관계  :  합성관계 - 생성자에서 new -   ◆
              집약관계 - 생성자에서 참조  -  ◇

참조2)      연관관계        의존관계
<<Driver>> ――――> <<Car>> -----> <<GasPump>>

class Driver{
   private Car car;  // 멤버변수 - 연관관계
   public void fillGas( GasPump p ){  p.getGas(amount); }  //연산의 인자(참조값) - 의존관계
}


◎4. 기능흐름도  or  시퀀스다이어그램
1. 메뉴판 번호입력받기
2. 번호가 1이라면 유저추가
3. 번호가 2,3,4,5번이라면 - 로그인 / 각각의 기능
4. 번호가 9라면 종료
```java
while( 9가 아니라면 계속하기 ){
   // 메뉴판출력
   if( 입력받은 번호가 1번이면 ){유저추가  Add }  
   else if(9면 ){ 종료출력구문} 
   else {입력받은 번호가  2,3,4,5 번이면
      1) Login처리  
      2) 2,3,4,5 각각에서 처리해야할일
      switch(번호 ){
         2라면 : 조회처리  Show       break
         3라면 : 입금처리  Deposit    break
         4라면 : 출금처리  WithDraw   break
         5라면 : 삭제처리  Delete     break
      }
   } 
} 
```

◎5. 확장가능성


  
first
second
33333