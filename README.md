# 📌 일정 관리 앱 프로젝트
스파르타 내일배움캠프 세번째 프로젝트 !! <br>
Spring Boot와 친해져보자 👩‍💻

## 프로젝트 소개
Spring Boot 기반의 일정 관리 어플리케이션입니다.

## 기술 스택
**프레임워크** : Spring Boot 3.4.4<br>
**데이터베이스** : MySQL <br>
**빌드 도구** : Gradle-Groovy<br>
**언어** : Java 17 <br>

## API 명세서

기능 | METHOD | URL | request | response | 상태코드
-- | -- | -- | -- | -- | --
일정 등록 | POST | /api/schedules | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “created_date” : DATETIME } | 201 Created : 등록 성공
전체 일정 조회 | GET | /api/schedules |   | { “id” : Long “name” : string, “content” : string “created_date” : DATETIME } | 200 OK : 조회 성공
단일 일정 조회 | GET | /api/schedules/{id} |   | { “id” : Long “name” : string, “content” : string “created_date” : DATETIME } | 200 OK : 조회 성공 404 NotFound : 조회 실패
일정 전체 수정 | PUT | /api/schedules/{id} | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “updated_date” : DATETIME } | 200 OK : 수정 성공 404 NotFound : 수정 실패 , 해당 식별자가 존재하지 않는 경우 400 BadRequest : 수정 실패, 필수값 없음
작성자명 수정 | PATCH | /api/schedules/{id} | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “updated_date” : DATETIME } | 200 OK : 수정 성공 404 NotFound : 수정 실패 , 해당 식별자가 존재하지 않는 경우 400 BadRequest : 수정 실패, 필수값 없음
일정 내용 수정 | PATCH | /api/schedules/{id} | { “name” : string, “content” : string “password” : string } | { “id” : Long “name” : string, “content” : string “updated_date” : DATETIME } | 200 OK : 수정 성공 404 NotFound : 수정 실패 , 해당 식별자가 존재하지 않는 경우 400 BadRequest : 수정 실패, 필수값 없음
일정 삭제 | DELETE | /api/schedules/{id} | { “password” : string } |   | 200 OK : 삭제 성공  404 NotFound : 삭제 실패, 해당 식별자가 존재하지 않는 경우


## ERD
![Image](https://github.com/user-attachments/assets/50099cab-3027-43fc-979b-b6c6737d2420)


## DATABASE
<img width="498" alt="Image" src="https://github.com/user-attachments/assets/af4440ce-e687-4689-a9c7-4d8a3f857cf1" />






