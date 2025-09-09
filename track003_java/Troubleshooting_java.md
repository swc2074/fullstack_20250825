
---
# 🎯 최상욱 | Troubleshooting of 2025.08.27 WEB BASIC

> WEB BASIC  
> 
트러블슈팅 day010



<!-- 정리한 내용 1,2일 차 내용 -->
## 트러블 슈팅 (css에서 발생)

<br/> 트러블슈팅 (1)
```bash
TJ-BU-703-P03@DESKTOP-5CVIKGS MINGW64 /c/KIMYOUNGMIN/workspace (master)
$ git commit -m "git 수정 후 다시올리기"
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)       
        modified:   day001.md

no changes added to commit (use "git add" and/or "git commit -a")
```

---

🛠️ 트러블슈팅 (1) — Git 커밋 실패

```bash
$ git commit -m "git 수정 후 다시올리기"
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
        modified:   day001.md

no changes added to commit (use "git add" and/or "git commit -a")
```

#### 1. ❌ 문제점
- `day001.md` 파일이 수정되었지만 **`git add` 명령어를 통해 staging 영역에 올리지 않은 상태**에서 커밋을 시도함.
- 결과적으로 Git은 커밋할 변경사항이 없다고 판단하여 커밋이 실패함.

#### 2. ✅ 해결방안
- 아래 명령어를 통해 수정된 파일을 staging 영역에 추가한 후 커밋을 다시 수행함:

```bash
$ git add day001.md
$ git commit -m "day001.md 수정사항 반영"
```

#### 3. 💡 느낀점
- Git은 **작업 디렉토리와 staging 영역을 명확히 구분**하므로, 커밋 전에는 반드시 `git status`를 확인하고 변경사항을 staging에 올려야 함.
- 단순한 실수지만, 협업 중이라면 **커밋 누락으로 인해 팀원에게 혼선을 줄 수 있는 상황**이므로 습관적으로 `git add`와 `git status`를 체크하는 습관이 중요하다고 느꼈음.

---


트러블슈팅 (2)
```bash
TJ-BU-703-강사PC@DESKTOP-2Q95R1R MINGW64 /d/hyojung/workspace (master)
$ git pull  origin master 
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)     
Unpacking objects: 100% (3/3), 1.03 KiB | 15.00 KiB/s, done.
From https://github.com/sally03915/fullstack_20250825
 * branch            master     -> FETCH_HEAD
   031d931..5ac68d8  master     -> origin/master
Auto-merging day002.md
CONFLICT (content): Merge conflict in day002.md
```
---

🛠️ 트러블슈팅 (2) — Git Pull 시 Merge Conflict 발생

```bash
$ git pull origin master
Auto-merging day002.md
CONFLICT (content): Merge conflict in day002.md
```

### 1. ❌ 문제점
- 원격 저장소의 `day002.md` 파일과 로컬 파일 간에 **동일한 부분이 서로 다른 내용으로 수정되어 충돌 발생**.
- Git은 자동 병합이 불가능한 경우, 해당 파일에 **충돌 지점을 표시하고 수동 해결을 요구**함.

### 2. ✅ 해결방안
- 충돌 파일(`day002.md`)을 열어 Git이 표시한 충돌 구간(`<<<<<<<`, `=======`, `>>>>>>>`)을 확인함.
- 두 버전의 내용을 비교하여 **필요한 부분만 남기고 충돌 구간을 직접 수정**함.
- 수정 후 아래 명령어로 충돌 해결을 완료함:

```bash
$ git add day002.md
$ git commit -m "Merge conflict 해결: day002.md"
```

### 3. 💡 느낀점
- Git 충돌은 협업 중 자주 발생할 수 있는 상황이며, **충돌 지점을 정확히 파악하고 의도를 반영하는 수정이 중요**함.
- 단순히 충돌을 없애는 것이 아니라, **각 변경사항의 의미를 이해하고 조율하는 과정이 협업의 핵심**임을 체감함.
- 앞으로는 Pull 전에 `git fetch`와 `git diff`를 활용해 **변경사항을 미리 파악하고 충돌 가능성을 줄이는 습관**을 들여야겠다고 느꼈음.

---


트러블슈팅 (3)
```bash
TJ-BU-703-강사PC@DESKTOP-2Q95R1R MINGW64 /d/hyojung/workspace (master|MERGING) $ git pull origin master error: You have not concluded your merge (MERGE_HEAD exists). hint: Please, commit your changes before merging. fatal: Exiting because of unfinished merge.
```
<br/>


---

🛠️ 트러블슈팅 (3) — 병합 중 `git pull` 실패

```bash
$ git pull origin master
error: You have not concluded your merge (MERGE_HEAD exists).
hint: Please, commit your changes before merging.
fatal: Exiting because of unfinished merge.
```

### 1. ❌ 문제점
- 이전에 `git pull` 또는 `git merge` 명령어를 실행한 후 **충돌을 해결하지 않고 병합을 완료하지 않은 상태**에서 다시 `git pull`을 시도함.
- Git은 병합이 완료되지 않은 상태(`MERGE_HEAD` 존재)를 감지하고, **새로운 병합 작업을 시작할 수 없도록 차단**함.

### 2. ✅ 해결방안
- 먼저 충돌이 발생한 파일을 확인하고 수동으로 수정함.
- 수정 후 아래 명령어로 병합을 완료함:

```bash
$ git add <수정된 파일>
$ git commit -m "Merge conflict 해결 및 병합 완료"
```

- 이후 다시 `git pull`을 실행하면 정상적으로 작동함.

### 3. 💡 느낀점
- Git은 병합 상태를 명확히 관리하며, **중간에 병합을 완료하지 않으면 이후 작업이 막히는 구조**임을 체감함.
- 충돌 해결 후에는 반드시 `git add`와 `git commit`을 통해 병합을 마무리해야 하며, **작업 흐름을 정확히 이해하고 관리하는 습관이 중요**함.
- 앞으로는 병합 중 상태를 확인할 때 `git status`를 활용하고, 병합 완료 여부를 항상 체크하는 습관을 들여야겠다고 느꼈음.

---

## 📌 참고문헌
- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)


'''bash 

2025.09.09 트러블 슈팅
package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		// 변수
		int a, b;
		char ch;

		Scanner scanner = new Scanner(System.in);

		// 입력
		for (;;) {
			System.out.println("1. 정수를 하나 입력해주세요>");
			a = scanner.nextInt();
			if (a < 100) {
				break;
			}
		}
		for (;;) {
			System.out.println("2. 정수를 하나 입력해주세요>");
			b = scanner.nextInt();
			if (b < 100) {
				break;
			}
		}

		for (;;) {

			System.out.println("3. 연산자를 입력해주세요(+,-,*,/)>");
			ch = scanner.next().charAt(0);
			if (ch == '+') {
				break;
			} else if (ch == '-') {
				break;
			} else if (ch == '*') {
				break;
			} else if (ch == '/') {
				break;
			}
		}
		// 처리

		switch (ch) {
		case '+':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%d", a, ch, b, a + b);
			System.out.println();
		case '-':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%d", a, ch, b, a - b);
			System.out.println();
		case '*':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%d", a, ch, b, a * b);
			System.out.println();
		case '/':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%.2f", a, ch, b, ((double) a / b));
		}

		// 출력

		scanner.close();

	}

}
```
``` 수정파일
package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		// 변수
		int a, b;
		char ch;
		double result = 0;

		Scanner scanner = new Scanner(System.in);

		// 입력
		for (;;) {
			System.out.println("1. 정수를 하나 입력해주세요>");
			a = scanner.nextInt();
			if (a>=0 && a<=100) {
				break;
			}
		}
		for (;;) {
			System.out.println("2. 정수를 하나 입력해주세요>");
			b = scanner.nextInt();
			if (b>=0 && b<=100) {
				break;
			}
		}

		for (;;) {
			System.out.println("3. 연산자를 입력해주세요(+,-,*,/)>");
			ch = scanner.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				break;
			}
		}
		// 처리

		switch (ch) {
		case '+':result = a+b;break;	
		case '-':result = a-b;break;	
		case '*':result = a*b;break;
		case '/':result = (double)a/b;break;
			
		}

		// 출력
		System.out.println(" " + a + ch + b + " = " + (ch != '/' ? "" + (int)result : String.format("%.2f",result)));

		

	}

}
```
2025 0909 트러블 슈팅 (2)
package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver2 {
	public static void main(String[] args) {
		// 변수
		int num; String id, pass; double balance;
		Scanner scanner = new Scanner(System.in);

		// 입력 + 처리 + 출력
		System.out.println("WELCOME ! (주) CODE BANK");
		for (;;) {
			System.out.print("===== CODE BANK =====\n*" + " 1. 추가\n* 2. 조회\n* 3. 입금\n* 4. 출금\n* 5. 삭제\n* 9. 종료\n입력>>>");
			num = scanner.nextInt();
			if (num == 9) { System.out.println(" ATM을 종료합니다.");
				break;
			}
			switch (num) {
			case 1:
				System.out.println(" 1. 추가기능입니다.");
				System.out.println("아이디 입력");id = scanner.next();
				System.out.println("비밀번호 입력");pass = scanner.next();
				System.out.println("잔액입력");balance =scanner.nextDouble();
				//아이디입력 > _입력받기
				//비밀번호입력 > _입력받기
				//잔액입력    > _입력받기
			break;
			case 2:
				
				System.out.println("아이디:" );
				id = scanner.next();
				System.out.println("비밀번호:");
				pass = scanner.next();
				System.out.println("잔액입력");
				balance =scanner.nextDouble();
			break;
			case 3:
				System.out.println(" 3. 입금기능입니다.");
				System.out.println("아이디:" );
				id = scanner.next();
				System.out.println("비밀번호:");
				pass = scanner.next();
				System.out.println("잔액입력");
				balance =scanner.nextDouble();
			break;
			case 4:
				System.out.println(" 4. 출금기능입니다.");
			break;
			case 5:
				System.out.println(" 5. 삭제기능입니다.");
			break;
			
			}
		}
	}

}

/*
 * 하루에 하나씩 힌트 다음주 까지 숙제
 * 
 * Step1. 무한반복으로 만드는 메뉴만들기
 * 
 * for(;;){ // 1-1 무한반복 // 1-2 빠져나올 조건 9 ///1-3 입력받은 번후가 if or switch /// ///1을
 * 입력하면 추가기능입니다.. 출력구문까지만 ///2을 입력하면 조회기능입니다.. 출력구문까지만 ///3을 입력하면 입금기능입니다..
 * 출력구문까지만 ///4을 입력하면 출금기능입니다.. 출력구문까지만 ///5을 입력하면 삭제기능입니다.. 출력구문까지만 ///6을 입력하면
 * 종료기능입니다.. 출력구문까지만 ///7을 입력하면 추가기능입니다.. 출력구문까지만 /// /// ///}
 */
 ```
 ```
 2025 0909 트러블 슈팅 (3)
 package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver4_sam {
   public static void main(String[] args) {
      // 변수
      int num;
      String id = null, pass = null;
      double balance = 0;
      Scanner scanner = new Scanner(System.in);

      // 입력 + 처리 + 출력
      System.out.println("WELCOME ! (주) CODE BANK");
      for (;;) {
         System.out.print("===== CODE BANK =====\n*" + " 1. 추가\n* 2. 조회\n* 3. 입금\n* 4. 출금\n* 5. 삭제\n* 9. 종료\n입력>>>");
         num = scanner.nextInt();
         if (num == 9) { System.out.println(" ATM을 종료합니다."); break; }
         
         switch (num) {
         case 1:
            System.out.println(" 1. 추가기능입니다.");
            System.out.println("아이디 입력");
            id = scanner.next();
            System.out.println("비밀번호 입력");
            pass = scanner.next();
            System.out.println("잔액입력");
            balance = scanner.nextDouble();
            // 아이디입력 > _입력받기
            // 비밀번호입력 > _입력받기
            // 잔액입력 > _입력받기
            break;
         case 2: {
            System.out.println(" 2. 조회기능입니다.");
            String temid, tempass;
            // 입력 2-1 사용자에게 임시아이디와 임시비밀번호 입력 받기
            // 2-2 아이디와 임시아이디가 같아야한고 비번과 임시비밀번호가 같다면 사용자정보 출력
            // 2-3 다르면 정보를 확인해 주세요.
            System.out.println("아이디:");
            temid = scanner.next();
            System.out.println("비밀번호:");
            tempass = scanner.next();
            if (id.equals(tempass) && pass.equals(tempass)) {
               System.out.print("==🎈🎈 조회\n" + "ID:" + id + "\n" + "pass:" + pass + "\n" + "나이: 1" + "\n"
                     + "잔액:" + balance+"\n");
            } else {
               System.out.println("정보를 확인해주세요");
            }

         }
            break;
         case 3:{
            System.out.println(" 3. 입금기능입니다.");
            
            // 변수 
            String temid = null, tempass = null;
            double income = 0 ;
            // 입력 사용자에게 임시아이디와 임시비밀번호 입력받기
            // 처리 if ( 아이디와 임시아이디가 같고 비번과 임시비번이 같다면 ) { 돈입력 받아서, 잔액에서 추가}
            // 출력 else { 아니라면 정보를 확인해주세요.}
            System.out.println("아이디:");temid = scanner.next();
            System.out.println("비밀번호:");tempass = scanner.next();

            if(id.equals(temid) && pass.equals(tempass)) {            
               System.out.println("입금");income = scanner.nextDouble();
               balance += income;
               System.out.print("==입금완료\n" + "잔액:" + balance + "\n");
            }else {System.out.println(" 정보를 확인해 주세요");}
         }break;
         case 4:{
            System.out.println(" 4. 출금기능입니다.");
            

            // 변수 
            // 입력 사용자에게 임시아이디와 임시비밀번호 입력받기
            // 처리 if ( 아이디와 임시아이디가 같고 비번과 임시비번이 같다면 ) { 돈입력 받아서, 잔액에서 빼기}
            // 출력 else { 아니라면 정보를 확인해주세요.}
            String temid1 = null, tempass1 = null;
            double outcome = 0;
            System.out.println("아이디:");temid1 = scanner.next();
            System.out.println("비밀번호:"); tempass1 = scanner.next();
            if(id.equals(temid1) && pass.equals(tempass1)) {
               System.out.println("출금"); outcome = scanner.nextDouble();
               balance -= outcome;
               System.out.print("==출금완료\n" + "잔액:" + balance + "\n");
            }else {System.out.println(" 정보를 확인해 주세요");}
            
         }break;
         case 5:{
            System.out.println(" 5. 삭제기능입니다.");
            // 변수 
            // 입력 사용자에게 임시아이디와 임시비밀번호 입력받기
            // 처리 if ( 아이디와 임시아이디가 같고 비번과 임시비번이 같다면 ) { 
            //      삭제하시겠습니까? 묻고 yes면 정보삭제 -  id = null, pass = null;  balance = 0;    }
            // 출력 else { 아니라면 정보를 확인해주세요.}
            String temid2 = null, tempass2 = null; 
            char Del = ' ';
            System.out.println("아이디:"); temid2 = scanner.next();
            System.out.println("비밀번호:"); tempass2 = scanner.next();
            System.out.println(" 삭제하시겠습니까?"); 
            Del = scanner.next().charAt(0);
            if (Del == 'y') {System.out.print(" 정보 삭제했습니다."); 
                           Del = scanner.next().charAt(0);}
            else {System.out.println(" 정보를 확인해 주세요");   
            }
         }break;
         
         }
      }
   }

}
```
