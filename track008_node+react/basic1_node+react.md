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

##  PROJECT
[project]
    ㄴback  : boot+jwt+redis+oauth2.0+jpa+mybatis
    ㄴfront : react+next+antd

    
###1. [BACK] boot+security+jwt+redis+oauth2.0+jpa+mybatis

1. JAVA 17
2. SPRING BOOT (gradle)
3. boot+security+jwt+redis+oauth2.0+jpa+mybatis 

- SPRING boot (애플리케이션 기반의 프레임워크/ 내장 tomcat / 자동설정 )
- SPRING security (인증,인가/필터체인의 요청보호/oauth2.0 같은 인증방식으로 쉽게 연동)
- jwt( json web token : 토큰기반의 인증방식 / 토큰안에 사용자 정보와 권한을 담아 전달 ,
       서버가 세션을 직접 관리하지 않고, 클라이언트가 토큰을 보관)
- redis( 캐시/세션을 관리 , refresh token을 저장, 캐싱처리에 활용, 분산환경에서 세션공유 가능 )
- oauth2.0 (외부인증 연동, 구글, 네이버, 카카오로그인)
- jpa(  orm기반의 데이터베이스 접근 , 엔티티클리스와 db테이블 매핑, sql작성없이 객체중심의 데이터 처리)
- mybatis ( 복잡한 쿼리 작성 )

1.  SPRING boot  → 애플리케이션 실행기반
2.  SPRING security + jwt/oauth2.0   → 인증/인가 처리
3.  redis   →  토큰/세션/캐시관리
4.  jpa + mybatis  → 데이터베이스 접근 (orm + sql mapper 병행)

<br/>

##### [실습]  1. 스프링부트 프로젝트 
- [x] 1. 개발개요안내
- [x] 2. java.sun.com - JAVA 17 다운로드 - 설치
- [x] 3. SPRING BOOT   - https://spring.io/ - 다운로드 - 설치
  > 이전버젼
  https://github.com/spring-projects/spring-tools/wiki/Previous-Versions
- [x] 4. SPRING BOOT 프로젝트 만들기
- [x] 5. lombok


<br/>

##### [실습] 2. model  (엔티티 → 레파지토리 → 서비스)
1. 엔티티 관계도
2. 엔티티 작성

사람( AppUser ) → 글(Post) → 댓글(Comment)
사람( AppUser ) → 글(Post) → 좋아요(PostLike)
사람( AppUser ) → 글(Post) → 리트위(Retweet)
사람( AppUser ) → 다람 사람( AppUser ) → 팔로우 (Follow)
글(Post) → 해시태그(Hashtag)
글(Post) → 사진(Image)

```
👤 User(AppUser)
   ├── 📝 Post(글)
   │     ├── 💬 Comment(댓글)
   │     ├── ❤️ PostLike(좋아요)
   │     ├── 🏷️ Hashtag(해시태그)
   │     ├── 🖼️ Image(사진)
   │     └── 🔄 Retweet(리트윗)
   │
   ├── 👣 Follow(팔로우) → 다른 User
   └── 🚫 Block(차단) → 다른 User
```

1. AppUser
2. Post
3. Image
4. Hashtag
5. Comment
6. Follow
7. Retweet
8. PostLike


AppUser 관계매핑
###1. 사람 → 글
- 내가 쓴 게시글
- 한 사람이 여러글을 쓸수 있다. (OneToMany)
- 글(Post) 쪽에서는 누가썼는지 기억 (ManyToOne)


Post 관계매핑
###1. 글(Post.java : 테이블명 Posts) → 이미지(Image.java : 테이블명 Images)
- 글은 많은 이미지를 갖는다.   (OneToMany)
- 이미지는 글 하나에만 속한다.   (ManyToOne)
```
Long id, String content,  AppUser user;  boolean deleted = false;
LocalDateTime createdAt;  LocalDateTime updatedAt;
```

Image
Long id, String src, Post post;

```
2. 레파지토리
[com.thejoa703.repository]
- [x] 1. AppUserRepository
- [ ] 2. PostRepository
- [ ] 3. ImageRepository
- [ ] 4. HashtagRepository
- [ ] 5. CommentRepository
- [ ] 6. FollowRepository
- [ ] 7. RetweetRepository
- [ ] 8. PostLikeRepository

```
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{//Entity, PK
}


CREAT: save - INSERT INTO appuser (컬럼1, 컬럼2,,) values (?,?,,)
READ : findAll - select * appuser 
       findById - select * from appuser where id=?
UPDATE: save - update appuser  set 컬럼1=? , 컬럼2=? where id=?
DELETE: deleteById - delete from appuser where id=?
```
            사용자    관리자
create      ◎회원가입   ◎회원가입
read        로그인, 이메일중복, 닉네임중복, (페이징이 들어간 유저조회)
update      ◎닉네임수정, ◎이미지수정
delete      ◎회원탈퇴

```
```
3. mybatis
- [ ] 1. build.gradle
- [ ] 2. application.yml
- [ ] 3. [com.thejoa703.domain] - DeptUser  @Entity
- [ ] 4. [com.thejoa703.mapper] - @Mapper ( 복잡한 SQL) / 기본CRUD @Repository(save, findById, findAll, deleteById)
- [ ] 5. [com.thejoa703.service] - DeptService
- [ ] 6. [com.thejoa703.controller] - DeptController
```
```
4. service

- [x] 1. dto - requestDto / responseDto
- [x] 2. UTIL : 이미지업로드
      - application.yml 이미지설정
      - service 작성
- [ ] 3. UTIL : 암호화
- [ ] 4. AppUserService  <유저>
- [ ] 5. PostService     <게시글>
- [ ] 6. Etc Service



```
5. security + jwt + redis + oauth2.0

■ 전체구조
1) 로컬회원가입 : 이메일/비밀번호 가입
            -> PasswordEncoder 암호화
            -> 로그인 JWT 발급

2) 소셜로그인  : 구글/카카오/네이버 인증 성공
            -> OAuth2SuccessHandler 에서 JWT 발급

2.  JWT 발급 구조
    1)Access Token : 짧은 기간  유효(출입증)    -> api 호출 시 사용
    2)Refresh Token : 긴   기간 유효(장기체류증)    ->  redis 냉장고에 안전 보관

3. 프론트엔드 (react + next) 처리
    1)Access Token 를 localStorage에 저장
    2)Api 호출 'Authorization: Bearer <token>' 헤더에 붙임

4. 서버처리
 - 'JwtAuthenticationFilter'가 모든 요청 앞에서 토큰검증
 - 검증성공시 ' SecurityContext' 사용자 정보 저장
 - Controller/Service에서 현재 사용자 id로 db조회 응답

 ```
 STEP1)
```
[사용자]
   ├─▶ 로컬 회원가입/로그인
   │       - 이메일/비밀번호 → DB 저장
   │       - 로그인 성공 시 JWT 발급
   │
   └─▶ 소셜 로그인(OAuth2)
           - 구글/카카오/네이버 인증
           - OAuth2SuccessHandler 실행
             • 사용자 정보 추출
             • DB 저장/조회
             • Access Token 발급 (출입증)
             • Refresh Token 발급 (장기체류증) → Redis 저장 + 쿠키
```

STEP2)
```
[프론트엔드]
   └─▶ Access Token localStorage 저장
        API 호출 시 Authorization 헤더에 Bearer 붙임
```

STEP3)
```
[Spring Boot 서버]
   ├─▶ JwtAuthenticationFilter
   │       - 토큰 검증 (출입증 검사)
   │       - SecurityContext에 사용자 정보 저장
   │
   └─▶ Controller/Service
           - userId 기반 DB 조회
           - 응답 반환 (사원증 스캔)
```

■ 2. JWT 구조
1. Header -> 토큰의 머릿말 (이 토큰은 HS256 알고리즘으로 서명했어! 정보)
```json
   { "alg": "HS256", "typ": "JWT" }
```
2. Payload(Claims) -> 토큰의 몸통 (누가, 어떤권한, 언제까지 사용자의 신분증정보)
```json
   {
     "iss": "thejoa703",   // 발급자
     "sub": "12345",       // 사용자 ID
     "role": "USER",       // 권한
     "email": "user@test.com",
     "exp": 1737000000     // 만료 시간
   }
```

3. Signature -> 토큰의 도장 (서버만 아는 비밀키로 찍은 도장 -> 위변조 방지)
```json
   HMACSHA256(base64UrlEncode(header) + "." + base64UrlEncode(payload), secret)
```

■ 3. 핵심정리
1. JWT VS 세션
- 세션: 서버 메모리에 사용자 상태를 저장 -> 서버확장시 부담 
                                                (서버에서 출입명단 직접 들고 있는 것)
- JWT(Json Web Token) : 토큰 자체에 인증정보를 포함 -> 확장성
                                                (사용자가 출입증을 직접 들고다니기)
2. Access Token vs Refresh Token
1)Access Token : 짧은 기간  유효(출입증)    -> api 호출 시 사용
2)Refresh Token : 긴   기간 유효(장기체류증)    ->  redis 냉장고에 안전 보관       

3. Redis 사용이유?
- 토큰냉장고 -> 장기체류증 안전하게 보관, 필요시 꺼내 씀
- Refresh Token 중앙에서 관리
- TTL(만료 시간)로 자동 만료처리
- 로그아웃 시 즉시 삭제 

[실습1]
0. docker에서 redis 설정
https://www.docker.com/products/docker-desktop/
- 다운로드 및 설치
```bash
docker --version
docker ps
docker pull  redis
docker run   -d  --name  my-redis  -p 6379:6379   redis
```
```bash
docker  exec  -it  my-redis  redis-cli
docker  exec  -it  my-redis  redis-cli  FLUSHALL
keys *
get  저장이름
```


```
1. build.gradle -> security, jwt, redis, oauth2.0
2. application.yml/ application-oauth.yml, .dot (중요키)

[실습2]
1. security + jwt + redis
 - JwtProperties : 토큰
    * issuer, secret, expSeconds 기본속성
 - Jwtprovider   : 토큰 발급
    * Access Token (출입증), Refresh Token 생성, 파싱
 - TokenStore    : 토큰 냉장고
    * Redis 저장소, Refresh Token   refresh:<userId>
 - JwtAuthenticationFilter : 보안 게이트
    * 매 요청마다 Authorization 헤더 확인 → 토큰검증 → SecurityContext에 사용자 정보저장
    * API 입구에서 신분증 검사하는 게이트

2. oauth2.0
  - OAuth2  : 입국 심사대
  - UserInfoOAuth2 / UserInfoNaver , UserInfoKakao , UserInfoGoogle
  - CustomOAuth2User
  - OAuth2SuccessHandler

3. 설정파일
 - SecurityConfig
 - WebConfig
 - RedisConfig
 - SwaggerConfig

[실습3]
1. service
    >> AuthUserJwtService [공통]
2. controller
    >> 각각의 컨트롤러에서