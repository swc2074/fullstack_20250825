
---
# 🎯 최상욱 | 실전형 풀스택 개발자 포트폴리오

> 완벽보다는 완성을 향해  
> **기획부터 배포까지, 사용자 흐름을 설계하고 끝까지 해결하는 개발자**
단순한 기능 구현을 넘어  
**CS 기반의 구조적 문제 해결 능력**과  
**협업 중심의 실전 경험**으로  
**서비스의 본질을 이해하고, 사용자 중심의 개발을 실현합니다.**

- 💡 **기획 단계부터 사용자 여정을 설계**하며, 기능이 아닌 ‘경험’을 만드는 데 집중합니다.  
- 🧠 **자료구조, 알고리즘, 네트워크, 운영체제 등 핵심 CS 지식**을 바탕으로, 복잡한 문제도 구조적으로 접근합니다.  
- 🤝 **협업과 커뮤니케이션에 능숙**하며, 팀의 목표를 함께 고민하고 해결해온 경험이 있습니다.  
- 🚀 **배포 이후까지 책임지는 개발자**로서, 실제 사용자 피드백을 반영해 지속적으로 개선해왔습니다.

> “기술은 도구일 뿐, 문제를 해결하는 사람이 되자”  
> **최상욱은 기술 너머의 가치를 고민하는 개발자입니다.**

---

<br/>

---
<!-- 이름, 이메일, 깃허브주소, 포트폴리오 2*4 테이블형식으로 -->
## Contact & Links
![프로파일](./track001_github/3099502_man_astronaut_icon.png)
<img src="./track001_github/5980341_carrier_coronavirus_epidemic_human_infectious_icon.png" alt="프로필" width="50">
|이름|최상욱 
|-|-|
|**이메일**|gforce74@naver.com|
|**포트폴리오**|🤞💖|
|**깃허브주소**|https://github.com/swc2074/fullstack_20250825|

---
<!-- track001 github -->
## 🚀Golds
- Gitthub의 **핵심기능 협업기능** 이해하고 실습함.
- markdown을 활용한 **간결한 문서작성가능**
- 협업을 위한 github **`협업위한 워크플로워 능력 습득`**
- ai도구와 함께하는 **`협업 및 업무향상`**



---
<!-- cs와 연결지어서 -->
## ✔ 기술스택 기반 cs역량
- git & github
- markdown
- vs code
- html5
- css3
- ai 프롬프트

| 🔧 기술스택       | 💡 CS 기반 이해 및 활용 능력 강조                                                                 |
|------------------|---------------------------------------------------------------------------------------------|
| **Git & GitHub** | **분산 버전 관리 시스템의 구조**를 이해하고, 브랜치 전략(Git Flow)을 **실무에 능숙하게 적용**함. <br> Merge Conflict 시 트리 구조와 해시 기반 저장 원리를 고려하여 **안정적인 병합 수행**. |
| **Markdown**     | 문서 구조화와 정보 설계 원리를 바탕으로 **가독성 높은 협업 문서 작성**. <br> README, Wiki, 이슈 템플릿 등에서 **사용자 흐름을 고려한 표현 능력** 보유. |
| **VS Code**      | IDE의 작동 원리와 **디버깅, 확장 기능, Linting 도구를 적극 활용**하여 개발 생산성 극대화. <br> 파일 시스템과 메모리 구조를 고려한 **문제 원인 분석 능력** 보유. |
| **HTML5**        | DOM 구조와 트리 기반 렌더링 원리를 이해하고, **접근성과 유지보수성을 고려한 시맨틱 마크업 작성**. <br> SEO 최적화와 UX 향상에 기여. |
| **CSS3**         | 박스 모델, Flex/Grid 레이아웃 알고리즘 등 렌더링 엔진 원리를 기반으로 **구조적이고 반응형 UI 설계**. <br> 미디어 쿼리와 성능 최적화를 **실무에 적용**. |
| **AI 프롬프트**  | NLP 모델의 토큰화, 컨텍스트 길이 등 내부 구조를 이해하고, **프롬프트 최적화를 통해 자동화 기능 구현**. <br> 실제 서비스에 적용 가능한 **AI 활용 역량** 보유. |

<br/>
<br/>
<br/>

---
<!-- JAVA, HTML+CSS+>
## 🥕포트폴리오

<!-- 정리한 내용 1,2일 차 내용 -->
## 트러블 슈팅 (github에서 발생)

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