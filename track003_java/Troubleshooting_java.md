
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