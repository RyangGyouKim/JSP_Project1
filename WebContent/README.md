#Explanation
�� ������Ʈ�� �����α׷��� ���� �⸻��� ��ü ������Ʈ�ν� ����� ���ΰ� �⸻��� ���ǿ� �´� ��������Ʈ �����Ϸ����Ѵ�.
>�Ʒ��� ������Ʈ ���� �� �򰡹���̴�.
>> 1. ��������
>> 2. JSP, ����, �ڹٺ��� �� �� ����� ���� ���� (5��)
>> 3. MVC ���� ����� ����Ʈ���� ���� ����� ���� ���� (5��)
>> 4. �����ͺ��̽��� ���� ���ؿ� Ȱ��(5��)
>> 5. �����α׷��ֿ� ���� ��Ȯ�� ���ؿ� �м�(5��)
>>> �� 20������



#board.jsp
board.jsp is basic screen of this web project.
It has the following functions.
> 1. signUp
>> ȸ������ ���
> 2. logIn
>> �α��� ���
> 3. logOut
>> �α׾ƿ� ���
>>> ���� ó���� �ذ�.
> 4. contest
>> �Խ��� ���
>> 4.1 fileUpload



#login.jsp
This has simple objects.
> 1. testID
>> ������ �� �����̶�� �ȳ�, �ȳ������ ���� ����
>> ID ���̴� 10�ڸ� �̳�
> 2. testPW
>> ������ �� �����̶�� �ȳ�, �ȳ������ ���� ����
>> ��й�ȣ�� 4�ڸ� �̻�
> 3. btnLogin
>> ȸ�� o, �Է����� o - board.jsp�� �̵�
>> ȸ�� o, �Է����� x - history.go(-1)�� �ٽ� �õ� �� �ȳ�����
>> ȸ�� x, �Է����� o - history.go(-1)�� �ٽ� �õ� �� �ȳ�����
>> ȸ�� x, �Է����� x - history.go(-1)�� �ٽ� �õ� �� �ȳ�����
> 4. btnSignUp
>> signUp.jsp�� �̵�



#signUp.jsp 
This has some objects for signup.
> 1. testID
>> ���̵�
> 2. testPW
>> ��й�ȣ
> 3. testPhone
>> ����ó
> 4. testEmail
>> �̸���
> 5. testAddr
>> �ּ�, Address�� ����
> 6. btnCancel
>> ��ҹ�ư
>> �� ��ư�� ������ login.jsp ȭ������ �̵�
> 7. btnSignUp
>> ȸ������ ��ư
>> ȸ������ ��ư ������ DB ��ȸ�Ͽ� �ߺ��� �ƴ϶�� ȸ������ ���� �� login.jsp�� �̵�
>> ȸ������ ��ư ������ DB ��ȸ�Ͽ� �ߺ��̶�� �̹� ������ ȸ�� Ȥ�� ���̵� �ߺ��̶�� �ȳ� �޼��� �ȳ��� �� history.go(-1) ����



#contents.jsp
This objects are for contests.
> 1. testIndex
>> �Խñ� ��ȣ
> 2. testTitle
>> �Խñ� ����
> 3. testDate
>> �Խñ� ��¥
> 4. testCountComment
>> ��ۼ�
> 5. testRecommendation
>> ��õ��



#Databases
�����ͺ��̽��� �̱��� ����� ����� ����

> 1. member table
>> 1. create table member (
>> 2. testId varchar(10) not null,
>> 3. testPw varchar(10) not null,
>> 4. testPhone varchar(11) not null,
>> 5. testEmail varchar(50) default null,
>> 6. testAddr varchar(100) default null,
>> 7. primary key
>> 8. ) default charset=utf8;

> 2. contents table
>> 1. create table contents (
>> 2. testIndex int auto_increment,
>> 3. testTitle varchar(30) not null,
>> 4. testDate datetime not null,
>> 5. testCountComment int,
>> 6. testRecommendation int,
>> 7. primary key(testIndex)
>> 8. ) default charset=utf8;
