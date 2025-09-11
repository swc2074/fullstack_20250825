# 🎨 HTML & CSS 학습 포트폴리오 - 최상욱

> **기능이 아닌 '경험'을 만드는 마크업 개발자**  
> 시맨틱 마크업, 레이아웃 설계, 반응형 UI까지 —  
> 기획 의도를 시각적으로 구현하며 사용자 경험을 설계합니다.

---

## 📌 프로젝트 소개

이 저장소는 HTML5와 CSS3를 중심으로 한 실습 결과물, 마크업 구조 설계, 트러블슈팅, 그리고 사용자 중심의 UI 구현 사례들을 기록한 포트폴리오입니다.

> 단순한 마크업 작성을 넘어 **접근성, 시맨틱 구조, 반응형 레이아웃, 사용자 흐름**을 고려하여 개발합니다.

---

## 🧰 사용 기술

| 기술 | 설명 |
|------|------|
| **HTML5** | 시맨틱 태그를 사용하여 명확하고 구조화된 문서 설계 |
| **CSS3** | 박스 모델, Flex/Grid 레이아웃, 미디어 쿼리, 반응형 웹 |
| **VS Code** | 라이브 서버 환경에서 실시간 마크업 확인 및 디버깅 |
| **Chrome DevTools** | 실시간 스타일 수정 및 반응형 디버깅 |
| **Git & GitHub** | 소스 코드 버전 관리 및 마크다운 기반 문서화 |

---

## 🎯 개발자 역량 키워드

- 💡 **접근성을 고려한 시맨틱 구조 설계**
- 🧱 **박스 모델과 레이아웃 원리에 기반한 CSS 설계**
- 📱 **모바일-퍼스트 반응형 UI 구현 경험**
- 🔍 **렌더링 성능 최적화 및 크로스 브라우징 대응**
- 📖 **실전형 트러블슈팅 경험 축적 및 공유**

---

## 🛠️ 트러블슈팅 사례

### ⚠️ 트러블슈팅 1 — margin collapse 현상

#### 💬 문제 상황
두 개의 블록 요소가 위아래로 인접할 때, 상하 `margin`이 겹쳐서 하나만 적용되는 현상 발생.

```html
<div class="box1"></div>
<div class="box2"></div>

.box1 { margin-bottom: 50px; }
.box2 { margin-top: 30px; }
🚨 증상

기대한 간격: 80px

실제 적용된 간격: 50px (더 큰 margin 하나만 적용됨)

✅ 해결 방법

padding으로 대체하거나

중간에 border/padding/overflow 설정 추가로 마진 겹침 방지

.parent {
  overflow: hidden;
}

⚠️ 트러블슈팅 2 — 인라인 요소 vertical-align 문제
💬 문제 상황

<img> 태그 하단에 미세한 여백 발생

<p>텍스트와 이미지 <img src="img.jpg" /></p>

🧾 원인

img는 기본적으로 inline 요소이며, **글꼴 기준선(baseline)**에 맞춰 정렬됨.

이로 인해 하단에 작은 여백이 생김.

✅ 해결 방법
img {
  vertical-align: middle; /* or top, bottom */
}


또는 display 속성을 block으로 변경:

img {
  display: block;
}

⚠️ 트러블슈팅 3 — Flexbox 사용 시 height 100%가 적용되지 않음
💬 문제 상황

Flexbox 레이아웃에서 자식 요소에 height: 100%를 주었지만 실제 높이가 부모만큼 늘어나지 않음.

.parent {
  display: flex;
  height: 100vh;
}

.child {
  height: 100%;
}

🧾 원인

html, body에 높이 지정이 없을 경우, 상대 길이(%)는 작동하지 않음.

✅ 해결 방법
html, body {
  height: 100%;
}

🌐 프로젝트 실행 방법
# 클론
git clone https://github.com/swc2074/fullstack_20250825.git

# HTML-CSS 디렉토리로 이동
cd fullstack_20250825/html-css

# Live Server 사용 또는 브라우저에서 index.html 직접 실행

📁 디렉토리 구조 예시
html-css/
├── day001_semantic/
│   └── index.html
├── day002_flexbox/
│   └── layout.html
├── day003_grid/
│   └── responsive.html
└── README.md

📌 학습 요약
주제	학습 내용 요약
시맨틱 마크업	웹 접근성과 SEO를 고려한 태그 선택 및 구조 설계
박스 모델	여백, 테두리, 내부 간격 개념 및 레이아웃에 미치는 영향
Flexbox	1차원 정렬을 위한 레이아웃 시스템. 축 기준 정렬 실습
Grid	2차원 레이아웃 시스템으로 복잡한 배치 해결
미디어 쿼리	다양한 해상도 대응을 위한 반응형 웹 설계
🙋‍♂️ About Me
항목	내용
이름	최상욱
이메일	gforce74@naver.com

GitHub	github.com/swc2074

포트폴리오	업데이트 예정
📚 참고 자료

MDN HTML Reference

MDN CSS Reference

Flexbox Froggy

CSS Tricks - Complete Guide to Flexbox

Responsive Web Design Basics - Google