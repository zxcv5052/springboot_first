##### "스프링 부트와 AWS로 혼자 구현하는 웹서비스" 책을 기반으로한 학습
##
#### Project Spec
Moudule | Version
------------ | ------------- 
Spring Boot | 2.1.9 RELEASE
JDK | 10.0.2 
Gradle | 4.8

----
#### Using Library
Library | 설명
------------ | ------------- 
Lombok | 
Jquery | 
Spring Boot JPA | 

----
#### Gradle 이란?   
 - Gradle은 Groovy를 기반으로 Ant와 Maven과 같은 이전 세대 빌드 도구의 단점을 보완을 한 빌드 도구.   
 - 의존성이나 플러그인 설정 등과 같은 빌드에 필요한 설정을 하게 된다.  
  
#### API를 만들기 위한 클래스 3가지.  
 - Request 데이터를 받을 Dto  
 - API 요청을 받을 Controller  
 - 트랜잭션,도메인 기능 간의 순서를 보장하는 Service  
 
 ![web_hierarchy](/image/web_hierarchy.png)
