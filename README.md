# 📌 일정 관리 앱 프로젝트

### 프로젝트 소개
Spring Boot 기반의 일정 관리 어플리케이션입니다.

### 기술 스택
**프레임워크** : Spring Boot 3.4.4<br>
**데이터베이스** : MySQL <br>
**빌드 도구** : Gradle-Groovy<br>
**언어** : Java 17 <br>

### API 명세서
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>

<meta http-equiv="Content-Style-Type" content="text/css">
<title></title>
<meta name="Generator" content="Cocoa HTML Writer">
<meta name="CocoaVersion" content="2575.4">
<style type="text/css">
p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; font: 13.0px '.Apple SD Gothic NeoI'; color: #fd8208}
p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; font: 13.0px '.AppleSystemUIFont'; color: #fd8208}
p.p3 {margin: 0.0px 0.0px 0.0px 0.0px; font: 13.0px '.Apple SD Gothic NeoI'}
p.p4 {margin: 0.0px 0.0px 0.0px 0.0px; font: 13.0px '.AppleSystemUIFont'}
p.p5 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Helvetica}
p.p6 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Helvetica; min-height: 14.0px}
span.s1 {background-color: rgba(253, 130, 8, 0.15)}
span.s2 {font: 13.0px '.AppleSystemUIFont'}
span.s3 {font: 12.0px Helvetica}
span.s4 {font: 13.0px '.Apple SD Gothic NeoI'}
table.t1 {border-collapse: collapse}
td.td1 {border-style: solid; border-width: 1.0px 1.0px 1.0px 1.0px; border-color: #9a9a9a #9a9a9a #9a9a9a #9a9a9a; padding: 1.0px 5.0px 1.0px 5.0px}
</style>
</head>
<body>

기능 | METHOD | URL | request | response | 상태코드
-- | -- | -- | -- | -- | --
일정 등록 | POST | /api/schedules | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “created_date” : DATETIME } | 201 Created : 등록 성공
전체 일정 조회 | GET | /api/schedules |   | { “id” : Long “name” : string, “content” : string “created_date” : DATETIME } | 200 OK : 조회 성공
단일 일정 조회 | GET | /api/schedules/{id} |   | { “id” : Long “name” : string, “content” : string “created_date” : DATETIME } | 200 OK : 조회 성공 404 NotFound : 조회 실패
일정 전체 수정 | PUT | /api/schedules/{id} | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “updated_date” : DATETIME } | 200 OK : 수정 성공 404 NotFound : 수정 실패 , 해당 식별자가 존재하지 않는 경우 400 BadRequest : 수정 실패, 필수값 없음
작성자명 수정 | PATCH | /api/schedules/{id} | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “updated_date” : DATETIME } | 200 OK : 수정 성공 404 NotFound : 수정 실패 , 해당 식별자가 존재하지 않는 경우 400 BadRequest : 수정 실패, 필수값 없음
일정 내용 수정 | PATCH | /api/schedules/{id} | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “updated_date” : DATETIME } | 200 OK : 수정 성공 404 NotFound : 수정 실패 , 해당 식별자가 존재하지 않는 경우 400 BadRequest : 수정 실패, 필수값 없음
일정 삭제 | DELETE | /api/schedules/{id} | { “password” : string } |   | 200 OK : 삭제 성공  404 NotFound : 삭제 실패, 해당 식별자가 존재하지 않는 경우


</body>
</html>



### ERD
<img width="357" alt="Image" src="https://github.com/user-attachments/assets/0f625329-ef27-420b-8694-e5bfa1854571" />


![Image](https://github.com/user-attachments/assets/50099cab-3027-43fc-979b-b6c6737d2420)




