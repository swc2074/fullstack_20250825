##1. node + react


###1. node.js
    - javascprit 런타임환경
    - 비동기 이벤트 기반

### (1) 설치
https://nodejs.org.ko

4-1 power shell - node 인식 확인(node -v)
4-2. 오류
``` js


```
npm : 이 시스템에서 스크립트를 실행할 수 없으므로 C:\Program Files\nodejs\npm.ps1 파일을 로드할 수 없습니다. 자세한 내
용은 about_Execution_Policies(https://go.microsoft.com/fwlink/?LinkID=135170)를 참조하십시오.
위치 줄:1 문자:1
+ npm -v
+ ~~~
    + CategoryInfo          : 보안 오류: (:) [], PSSecurityException
    + FullyQualifiedErrorId : UnauthorizedAccess

    4-3.
    Get-ExecutionPolicy
    Set-ExecutionPolicy  RemoteSigned


#### (2) 프로젝트 만들기
```
npm init



```
[실습]
[project]
ㄴ back  # node 설정 ✅
ㄴ front  # react

``` js
mkdir back
cd back
npm init
```
#### (2) 프로젝트 만들기
```js
npm init
```

[실습]
[project]
ㄴ back    # node  ✅
ㄴ front   # react

```js
mkdir back
cd back
npm init
```

■ 구조확인

back/
├── config/
│   └── db.js                   # Oracle DB 설정 
├── middlewares/
│   └── isAuthenticated.js      # 로그인 인증 미들웨어
├── models/
│   └── users.js                # 사용 db 모델 및 쿼리함수 ( my batis)
├── passport/
│   ├── index.js                # Password 초기화
│   └── local.js                # Local 전략 설정
├── routes/
│   └── user.js                 # 사용자관련 api 라우터
├── node_modules/               # npm 패키지   
├── .env                        # 환경 변수  
├── app.js                      #  서버 진입점
├── package.json                #  ✅ 프로젝트 설정 및 스크립트   
├── package-lock.json           #  패키지 버젼 고정
├── test1_model_testUsers.js    # 테스트스크립트

```js
사용하고자하는 모듈설정이 들어간 package.json 폴더에 넣기
npm install
```


#### (3) 서버진입점 (`app.js`)
1. app.js 작성
2. 실행
```js
npx nodemon app.js


##2. 


 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 APP_USER_ID                               NOT NULL NUMBER
 EMAIL                                     NOT NULL VARCHAR2(255)
 PASSWORD                                  NOT NULL VARCHAR2(255)
 MBTI_TYPE_ID                                       NUMBER
 CREATED_AT                                         DATE
 UFILE                                              VARCHAR2(255)
 MOBILE                                             VARCHAR2(50)
 NICKNAME                                           VARCHAR2(100)


(2) db설정 
back/
├── config/
│   └── db.js              #     Oracle Db 설정        
├── .env                   #     환경변수  
├── models/
│   └── users.js                # 사용 db 모델 및 쿼리함수 ( my batis)   mapper
├── test1_model_testUsers.js    # 테스트스크립트

    createUser,
    findUserByEmail,
    verifyUser,
    getAllUsers,
    updateUserNickname,
    deleteUser,
    findUserById

2-1. .env  
```js
```

2-2. [config] - db.js
```js
``` 

(3) [models] - [users.js]
(4) 모델함수 테스트
# Node.js 의존성
node_modules/

# 빌드 결과물
dist/
build/
.next/

# 환경 변수 파일
.env
.env.local
.env.development.local
.env.test.local
.env.production.local

# 로그 파일
npm-debug.log*
yarn-debug.log*
yarn-error.log*
pnpm-debug.log*

# 캐시 및 임시 파일
.cache/
.tmp/
.DS_Store
*.swp

# 테스트 관련
coverage/

# IDE/에디터 설정
.vscode/
.idea/
*.sublime-workspace



### 2. controller (router)
back/
├── routes/
│   └── user.js   # 사용자관련 api 라우터

주소경로
post: /user/register (requestBody)
post: /user/login (requestBody)
post: /user/logout
get: /user/
patch: /user/{id}/nickname

※비교  /user/nickname?id = 1
delete: /user/{id}

1. app.js
app.use('/user', userRouter)

2. [routes] - user.js

### 3. Passport 로그인흐름 확인

```js
back/

├── middlewares/
│   └── isAuthenticated.js      # 로그인 인증 미들웨어
├── passport/
│   ├── index.js                # Password 초기화
│   └── local.js                # Local 전략 설정
```
1. [passport] - local.js  Local 전략 설정
2. [passport] - index.js  Password 초기화
3. [router] - user.js     
4. app.js  


### 
1. 클라이언트요청     /user/login
2. 라우터    rotes/user.js 
3. passport/local.js : ★LocalStategy - 이메일/비번검증해서 성공시 user반환
    DB조회   - findUserByEmail  성공 done(null, user) 사용자반환
4. passport/index.js : 로그인 성공시 호출 - user.APP_USER_ID 세션저장
    ★serializeUser : 세션에 pk저장
    ★deserializeUser : 세션의 pk로 db조회
5. app.js   :  세션저장 ( express-session) 쿠키(connect.sid) 발급
6. passport/index.js : 이후 요청마다 , deserializeUser 세션에 저장된 APP_USER_ID 꺼내 
                       사용자 정보 복원
7. middlewares/isAuthenticated.js : req.isAuthenticated()  로그인 여부 확인 , X면 401
    ★isAuthenticated: 로그인여부 체크
8. routes/users.js 로그아웃: 세션, 쿠키 제거