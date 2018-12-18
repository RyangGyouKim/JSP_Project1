#Explanation
이 프로젝트는 웹프로그래밍 수업 기말고사 대체 프로젝트로써 깃허브 공부겸 기말고사 조건에 맞는 웹프로젝트 제작하려고한다.
>아래는 프로젝트 조건 및 평가방법이다.
>> 1. 자유주제
>> 2. JSP, 서블릿, 자바빈즈 등 웹 기술에 대한 이해 (5점)
>> 3. MVC 패턴 기반의 소프트웨어 구현 방법에 대한 이해 (5점)
>> 4. 데이터베이스에 대한 이해와 활용(5점)
>> 5. 웹프로그래밍에 대한 명확한 이해와 분석(5점)
>>> 총 20점만점



#board.jsp
board.jsp is basic screen of this web project.
It has the following functions.
> 1. signUp
>> 회원가입 기능
> 2. logIn
>> 로그인 기능
> 3. logOut
>> 로그아웃 기능
>>> 세션 처리로 해결.
> 4. contest
>> 게시판 기능
>> 4.1 fileUpload



#login.jsp
This has simple objects.
> 1. testID
>> 공백일 시 공백이라고 안내, 안내방법은 추후 결정
>> ID 길이는 10자리 이내
> 2. testPW
>> 공백일 시 공백이라고 안내, 안내방법은 추후 결정
>> 비밀번호는 4자리 이상
> 3. btnLogin
>> 회원 o, 입력정보 o - board.jsp로 이동
>> 회원 o, 입력정보 x - history.go(-1)로 다시 시도 및 안내문구
>> 회원 x, 입력정보 o - history.go(-1)로 다시 시도 및 안내문구
>> 회원 x, 입력정보 x - history.go(-1)로 다시 시도 및 안내문구
> 4. btnSignUp
>> signUp.jsp로 이동



#signUp.jsp 
This has some objects for signup.
> 1. testID
>> 아이디
> 2. testPW
>> 비밀번호
> 3. testPhone
>> 연락처
> 4. testEmail
>> 이메일
> 5. testAddr
>> 주소, Address의 약자
> 6. btnCancel
>> 취소버튼
>> 이 버튼을 누를시 login.jsp 화면으로 이동
> 7. btnSignUp
>> 회원가입 버튼
>> 회원가입 버튼 누를시 DB 조회하여 중복이 아니라면 회원가입 승인 후 login.jsp로 이동
>> 회원가입 버튼 누를시 DB 조회하여 중복이라면 이미 가입한 회원 혹은 아이디 중복이라고 안내 메세지 안내한 후 history.go(-1) 실행



#contents.jsp
This objects are for contests.
> 1. testIndex
>> 게시글 번호
> 2. testTitle
>> 게시글 제목
> 3. testDate
>> 게시글 날짜
> 4. testCountComment
>> 댓글수
> 5. testRecommendation
>> 추천수



#Databases
데이터베이스는 싱글턴 방식을 사용할 예정

> member table
>> create table member (
>> testId varchar(10) not null,
>> testPw varchar(10) not null,
>> testPhone varchar(11) not null,
>> testEmail varchar(50) default null,
>> testAddr varchar(100) default null,
>> primary key
>> ) default charset=utf8;

> contents table
>> create table contents (
>> testIndex int auto_increment,
>> testTitle varchar(30) not null,
>> testDate datetime not null,
>> testCountComment int,
>> testRecommendation int,
>> primary key(testIndex)
>> ) default charset=utf8;
